package day_12Scanner;

import java.sql.SQLOutput;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 11;

        String result = "";

        if (number >= 1 && number <= 10){

            if (number == 1){
                result = "one";
            } else if (number == 2){
                result = "two";
            } else if (number == 3 || number == 6 || number == 9){
                result = "Fizz";
            } else {
                result = "Buzz";
            }
            System.out.println(result);
        }else{
            System.out.println("Invalid number");
        }
    }
}

