package DesignPatterns.Creational.SingletonDesignPattern;

/*
    Eager Load : instance is initialised as the system is up
    Lazy Load  : Instance is initialised only when any app module calls for it.

 */
public class SingletonDemo {
    public static void main(String[] args) {
    SingletonGlobal dbConnection1 = SingletonGlobal.getInstance();
    SingletonGlobal dbConnection2 = SingletonGlobal.getInstance();
    System.out.println(dbConnection1);
    System.out.println(dbConnection2);
    }
}

