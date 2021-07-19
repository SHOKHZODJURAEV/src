package day_16;

import java.util.Scanner;

public class StringPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter three words");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        String word4 = scan.next();
        // a=b && a=c, ====> b=c ==> a=b=c

        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() && word1.length()!=word3.length();

        if(allSame){
            System.out.println("All words are same length");
        }else if(notSame){
            System.out.println("All different length");
        }else{
            System.out.println("Not Same nor Different lengths");
        }
        scan.close();

    }
}
