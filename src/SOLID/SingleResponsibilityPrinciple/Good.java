package SOLID.SingleResponsibilityPrinciple;

public class Good {

    public static void calculateSalary() {
        System.out.println("Calculate Salary");
    }

    public static class SaveToDatabase {

        public void saveToDatabase() {
            System.out.println("Save to database");
        }
    }
    public static class GenerateReport{
        public void generateReport(){
            System.out.println("Generate Report");
        }
    }

    public static void main(String[] args) {
        Good g1 = new Good();
        g1.calculateSalary();
        SaveToDatabase s = new SaveToDatabase();
        GenerateReport g = new GenerateReport();
        s.saveToDatabase();
        g.generateReport();
    }
}
