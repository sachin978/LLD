package DesignPatterns.Creational.FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        /*  here client is manually calling classes which is tightly coupled
            client do not have idea about classes and all so we have to abstract it somewhere then call these classes
        Employee emp1 = new AndroidDeveloper();
        Employee emp2 = new WebDeveloper();
        System.out.println(emp2.salary());
         */
        Employee emp1 = EmployeeFactory.getEmployee("Android Developer");
        Employee emp2 = EmployeeFactory.getEmployee("Web developer");
        Employee emp3 = EmployeeFactory.getEmployee("Full Stack developer");
        System.out.println(emp1.salary());
        System.out.println(emp2.salary());
        System.out.println(  emp3 ==null ? "Developer does not exist!" : emp3.salary() );
    }
}
