package DesignPatterns.Creational.FactoryDesignPattern;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary(){
        System.out.println("Android developer's Salary: ");
        return 5000;
    }
}
