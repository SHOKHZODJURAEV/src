package day_19;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){ // i: 0, 1, 2, 3, 4, 5, 6,..10
            System.out.println("\t\t * * * * * *");
        }

        System.out.println(" * * * * * ");

        for (int i = 1; i < 6; i++) {
            System.out.println("*        *");

        }
        System.out.println(" * * * * * ");
        System.out.println(" ----------------- ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
            System.out.println("Sum: "+sum);
        }






        }
    }

