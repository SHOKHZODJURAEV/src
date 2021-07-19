package day_17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your account");
        String sentence = scan.nextLine();
        boolean startwithsen = sentence.startsWith("with") || sentence.startsWith("www");
        boolean endwithsen = sentence.endsWith(".com")||sentence.endsWith(".edu")||sentence.endsWith(".gov");

        if(startwithsen == true && endwithsen == true){
            System.out.println(" account is valid");
        }else{
            System.out.println("account is not valid");
        }
    }
}
