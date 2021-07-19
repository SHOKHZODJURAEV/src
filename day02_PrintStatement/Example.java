package day02_PrintStatement;

public class Example {
    public static void main(String[] args) {

        int salaryRate = 25;
        int weeklyHours = 40;
        int OneYear = 52;

        int weeklytotal = salaryRate * weeklyHours;
        int yeartotal = OneYear * weeklytotal;
        System.out.print("weekly salary:");
        System.out.println(weeklytotal);
        System.out.print("salary of a year:");
        System.out.println(yeartotal);
        double taxrate = 0.32;
        double totaltax = yeartotal * taxrate;
        System.out.print("Total Tax:");
        System.out.println(totaltax);
        double withouttax = yeartotal - totaltax;
        System.out.print("salary without tax:");
        System.out.println(withouttax);

    }





}
