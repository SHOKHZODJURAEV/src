package day_17;

import java.util.Scanner;

public class First_and_LastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();

        String first = word.substring(0, 1);


    }
}

/*
write a program that can check if the first and last characters of the string are same
	            ex:
	                level
	            output:
	                same
 */