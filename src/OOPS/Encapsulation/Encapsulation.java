package OOPS.Encapsulation;

public class Encapsulation{
   private int userId;
   private int AmountInBank;
   public String s = "public variable not encapsulated";

   public static void  main (String[] args){
       Encapsulation e = new Encapsulation();
       e.UserDetails(1,12);
       System.out.println(e.getUserId());
   }

    public Encapsulation(int userId, int amountInBank) {
        this.userId = userId;
        AmountInBank = amountInBank;
    }

    public Encapsulation() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAmountInBank() {
        return AmountInBank;
    }

    public void setAmountInBank(int amountInBank) {
        AmountInBank = amountInBank;
    }

    public void UserDetails(int userId, int amount){
        this.userId = userId;
        this.AmountInBank = amount;
    }
}


