package day_16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a string");
        String word = scan.nextLine(); // Programming
        /*String result (word.length() == 0)? "String is empty"
        :(word.length()>3)? word.substring(word.length()-2)
        : word
         */

        if(word.length() == 0){
            System.out.println("String is empty");
        }else if(word.length()>3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word);
        }
        scan.close();

        String name = "Cybertek";
        int Exname = name.length()-3;
        String user = name.substring(Exname);

        System.out.println(Exname);
        System.out.println(user);

    }
}
