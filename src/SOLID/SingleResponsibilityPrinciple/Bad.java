package SOLID.SingleResponsibilityPrinciple;
/*
All operation are happening in single class
which will increases complexity later in big codes
 */


public class Bad {
   public void employeeCalculateSalary(){
       System.out.println("Calculate Salary");
    }
    public void employeeSaveToDatabase(){
        System.out.println("Save to database");
    }
    public void employeeGenerateReport() {
        System.out.println("Generate Reports");
    }

    public static void main(String[] args) {
        Bad b = new Bad();
        b.employeeCalculateSalary();
        b.employeeGenerateReport();
    }

}
