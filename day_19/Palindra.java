package day_19;

import java.util.Scanner;

public class Palindra {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();
        String reverseWord = ""; // Level ==> level

        for(int i = word.length()-1; i >=0; i--){
            reverseWord += word.charAt(i);
        }
        boolean isPalindromec = word.equalsIgnoreCase(reverseWord);

        if(isPalindromec){
            System.out.println(word+" is palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }




    }
}
