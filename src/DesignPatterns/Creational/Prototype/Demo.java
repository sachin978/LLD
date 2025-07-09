package DesignPatterns.Creational.Prototype;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("192.0.0.1");
        networkConnection.loadVeryImportantData();
        System.out.println(networkConnection);
        NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection2);
    }
}
