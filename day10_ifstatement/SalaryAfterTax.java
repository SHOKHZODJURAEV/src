package day10_ifstatement;

public class SalaryAfterTax {
    public static void main(String[] args) {
        double salary = 135000;
        boolean isMarried = true;

        double  taxRate = 0;

        if(salary>130000){
            System.out.println(taxRate= 0.35);
        }else if (salary>=100000){
            System.out.println(taxRate=0.30);
        }else if (salary>80000){
            System.out.println(taxRate=0.25);
        }else{
            System.out.println(taxRate=0.20);
        }

        if(isMarried){
            System.out.println(salary-0.05);
        }
        double salaryAfterTax = salary*taxRate;
        System.out.println("Salary After Tax = " + salaryAfterTax);
    }
}
