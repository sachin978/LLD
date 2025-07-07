package OOPS.Inheritance;

public class InheritanceExample {


   static class Vehicle{
        String brand = "Generic";

        void start(){
            System.out.println("Generic Engine start with bruhhhh!!");
        }
        void stop(){
            System.out.println("Engine Stops! ");
        }
    }
   static class Car extends Vehicle{
        int door =4;

        @Override
        public void start() {
            System.out.println("Car engine Starts");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.brand = "Toyota";
        c.stop();    // parent function
    }
}
