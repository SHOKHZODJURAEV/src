package day_16;

import java.util.Scanner;

public class StringPrcatice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter two words");
        String word1 = scan.next(); // Apple
        String word2 = scan.next();
        //String result = "";

      String result = word1.substring(1)+" " + word2.substring(1);
        System.out.println(result);


    }
}
