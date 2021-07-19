package day_12Scanner;

public class practiceReplit {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 100;
        int num3 = 50;

        boolean result1 = num1 > num2 && num1 < num3 || num1 > num3 ;
        boolean result2 = num2>num1 && num2<num3;
        boolean result3 = !result1 && !result2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
