package day04_Variable;

public class TaxCalculations {
    public static void main(String[] args) {

        int salary = 80000;
        double stateTax = 0.08;
        double federalTax = 0.21;

        double totalStateTax = salary * stateTax;
        double totalFederalTax= salary * federalTax;
        System.out.println("salary: = $" + salary);
        System.out.println("you should pay: = $" + totalStateTax);
        System.out.println("you should pay: = $" + totalFederalTax);
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;
        System.out.println("salaryAfterTax = " + salaryAfterTax + " Shawn");



    }


}
