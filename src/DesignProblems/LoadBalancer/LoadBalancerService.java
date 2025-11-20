package DesignProblems.LoadBalancer;

import java.util.*;
import java.util.stream.Collectors;

// ====================
// Abstract LoadBalancer
// ====================


abstract class LoadBalancer {
    Map<RequestType, Service> serviceMap = new HashMap<>();

    public void register(RequestType requestType, Service service) {
        serviceMap.put(requestType, service);
    }

    Set<Destination> getDestinations(Request request) {
        Service service = serviceMap.get(request.requestType);
        if (service != null) {
            return service.destinations;
        }
        return new HashSet<>();
    }

    abstract Destination balanceLoad(Request request);
}

// ====================
// Least Connection LB
// ====================
class LeastConnectionLoadBalancer extends LoadBalancer {
    @Override
    Destination balanceLoad(Request request) {
        return getDestinations(request).stream()
                .min(Comparator.comparingInt(d -> d.requestsBeingServed))
                .orElseThrow(() -> new RuntimeException("No destinations available"));
    }
}

// ====================
// Routed LB
// ====================
class RoutedLoadBalancer extends LoadBalancer {
    @Override
    Destination balanceLoad(Request request) {
        List<Destination> list = new ArrayList<>(getDestinations(request));
        if (list.isEmpty()) throw new RuntimeException("No destinations available");
        return list.get(Math.abs(request.id.hashCode()) % list.size());
    }
}

// ====================
// Round Robin LB
// ====================
class RoundRobinLoadBalancer extends LoadBalancer {
    Map<RequestType, Queue<Destination>> destinationsForRequest = new HashMap<>();

    @Override
    Destination balanceLoad(Request request) {
        if (!destinationsForRequest.containsKey(request.requestType)) {
            Set<Destination> destinations = getDestinations(request);
            destinationsForRequest.put(request.requestType, new LinkedList<>(destinations));
        }

        Queue<Destination> queue = destinationsForRequest.get(request.requestType);
        if (queue.isEmpty()) throw new RuntimeException("No destinations available");

        Destination destination = queue.poll();
        queue.add(destination); // rotate
        return destination;
    }
}

// ====================
// Service
// ====================
class Service {
    String name;
    Set<Destination> destinations = new HashSet<>();

    public Service(String name) {
        this.name = name;
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void removeDestination(Destination destination) {
        destinations.remove(destination);
    }
}

// ====================
// Request
// ====================
class Request {
    String id;
    RequestType requestType;
    Map<String, String> parameters = new HashMap<>();

    public Request(String id, RequestType requestType) {
        this.id = id;
        this.requestType = requestType;
    }
}

// ====================
// RequestType Enum
// ====================
enum RequestType {
    READ,
    WRITE,
    UPDATE
}

// ====================
// Destination
// ====================
class Destination {
    String ipAddress;
    int requestsBeingServed;
    int threshold;

    public Destination(String ipAddress, int threshold) {
        this.ipAddress = ipAddress;
        this.threshold = threshold;
    }

    public boolean acceptRequest(Request request) {
        if (requestsBeingServed < threshold) {
            requestsBeingServed++;
            return true;
        } else {
            return false;
        }
    }

    public void completeRequest() {
        if (requestsBeingServed > 0) requestsBeingServed--;
    }

    @Override
    public String toString() {
        return ipAddress + " (Requests: " + requestsBeingServed + ")";
    }
}

// ====================
// LoadBalancerFactory
// ====================
class LoadBalancerFactory {
    public LoadBalancer createLoadBalancer(String lbType) {
        return switch (lbType.toLowerCase()) {
            case "round-robin" -> new RoundRobinLoadBalancer();
            case "least-connection" -> new LeastConnectionLoadBalancer();
            case "routed" -> new RoutedLoadBalancer();
            default -> throw new IllegalArgumentException("Invalid LoadBalancer type");
        };
    }
}

public class LoadBalancerService {
    public static void main(String[] args) {
        LoadBalancerFactory factory = new LoadBalancerFactory();

        LoadBalancer lb = factory.createLoadBalancer("round-robin");

        Service readService = new Service("ReadService");
        readService.addDestination(new Destination("192.168.0.1", 5));
        readService.addDestination(new Destination("192.168.0.2", 5));

        lb.register(RequestType.READ, readService);

        Request request1 = new Request("req1", RequestType.READ);
        Request request2 = new Request("req2", RequestType.READ);

        System.out.println(lb.balanceLoad(request1));
        System.out.println(lb.balanceLoad(request2));
        System.out.println(lb.balanceLoad(request1));
        System.out.println(lb.balanceLoad(request2));
    }

}


