package OOPS.Polymorphism;

import OOPS.Inheritance.InheritanceExample;

public class Polymorphism {

    static class Vehicle{
        String brand = "Generic";
        void start(){
            System.out.println("Generic Engine start with bruhhhh!!");
        }
    }
    static class Car extends Vehicle {
        int door =4;

        @Override   //polymorphism
        public void start() {
            System.out.println("Car engine Starts");
        }
    }

    public static void main(String[] args) {
        Polymorphism.Car c = new Polymorphism.Car();
        c.start();
        c.brand = "Toyota";// parent function
    }
}
