package day03_Variables;

public class SlarayCalculator {
    public static void main(String[] args) {

        int hourlyRate = 30;
        int weeklyHours = 40;
        int numberofWeeksInAYear = 52;
        int Salary = hourlyRate * weeklyHours * 52;

        System.out.println(Salary);

        double taxRate = 0.32;
        double totalTax = Salary * taxRate;
        double salaryaftertax = Salary - totalTax;

        System.out.println(salaryaftertax);






    }


}
