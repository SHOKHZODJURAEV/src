package day_17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("enter account");
        String Sentence = scan.nextLine();
        boolean sentense1  = Sentence.contains("@gmail.com");
        if(sentense1==true){
            System.out.println("Account valid");
        }else{
            System.out.println("Account must be @gmail.com");
        }
    }
}
