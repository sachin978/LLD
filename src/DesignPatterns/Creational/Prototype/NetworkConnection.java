package DesignPatterns.Creational.Prototype;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    public void loadVeryImportantData() throws InterruptedException {
        Thread.sleep(5000);
        this.importantData = "Time to yeh lega!";
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", importantData='" + importantData + '\'' +
                '}';
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    @Override
    public NetworkConnection clone() {
        try {
            NetworkConnection clone = (NetworkConnection) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
