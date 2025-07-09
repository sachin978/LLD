package DesignPatterns.Creational.FactoryDesignPattern;

public class WebDeveloper implements Employee{
   @Override
   public int salary(){
        System.out.println("Web developer Salary:");
        return 100000;
    }
}
