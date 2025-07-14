package DesignPatterns.Behavioral.Observer.Observer;

public class EmailAlert implements NotificationAlert{
   private String emailId;

  public  EmailAlert(String emailId){
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Mail send to:" + emailId);
    }
}
