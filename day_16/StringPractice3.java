package day_16;

import java.util.Scanner;

public class StringPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string with 3 letters:");
        String word = scan.next();

        if(word.length() == 3) {// if the word has three characters only

            if (word.charAt(1) == 'a') { // if the middle character is equal to 'a'
                System.out.println("Cool word");
            } else {
                System.out.println("okay word");
            }
        }else{// if the word has more than tree characters or less than tree characters
            if(word.length()<3){
                System.out.println("Word is too short");
            }else{// word has more than tree characters
                System.out.println("Word is too long");
            }
        }
    }
}
