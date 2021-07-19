package day_18;

import java.util.Scanner;

public class DigitLetterSpecialChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character");
        String character = scan.next();
        char B = character.charAt(0);
        String result = "";

        if (B>=0 && B<=9){
            result = "This character is a digit";
        }else if(B>='a' && B<='z' ){
            result = "This is character lower case";
        }else if(B>'A' && B<'Z'){
            result = "This is character is Uppercase";
        }else{
            result = "First character is special character";
        }
        System.out.println(result);

    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        char f  = word.charAt(0);

        if(f >= '0' && f<='9'){
            System.out.println("First character is a digit");
        }else if(f>= 'a' && f<='z'){
            System.out.println("First character is lowercase letter");
        }else if(f>='A' && f<='Z'){
            System.out.println("First character is uppercase letter");
        }else{
            System.out.println("First character is special character");
        }

        /// we also can change from system.out to result=
        scan.close();


     */



    }
}
