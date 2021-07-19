package day_12Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter hourly Rate:");
        double hourlyRate = scan.nextDouble();

        System.out.println("How many hours do you work in a week?");
       double weeklyHour  =   scan.nextDouble();

        System.out.println("How many weeks do you work in a year");
        int weeks = scan.nextInt();

        double salary = hourlyRate *weeklyHour * weeks;

        System.out.println("You are making $"+hourlyRate+"per hour");
        System.out.println("You are making $"+weeklyHour+" hours in a week");
        System.out.println("You are making $"+weeks+" hours in a year");
    }
}
