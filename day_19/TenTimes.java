package day_19;

import java.util.Scanner;

public class TenTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter ten numbers");
        int sum = 0;
        for(int i = 1; i<=10; i++){
            int number = scan.nextInt();
            sum+=i;
        }
        System.out.println("sum = "+sum);

    }
}
