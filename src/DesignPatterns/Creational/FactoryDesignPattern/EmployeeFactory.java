package DesignPatterns.Creational.FactoryDesignPattern;

public class EmployeeFactory {

    static Employee getEmployee(String empType){
        if( empType.equalsIgnoreCase("Android Developer") ){
            return new AndroidDeveloper();
        }else if( empType.equalsIgnoreCase("Web developer") ){
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
