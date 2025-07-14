package DesignPatterns.Behavioral.Observer.Observer;

public class MobileAlert implements NotificationAlert{
    private String userId;
    public MobileAlert(String userId){
        this.userId = userId;
    }
    @Override
    public void update() {
        System.out.println("message Sent to :" + userId);
    }
}
