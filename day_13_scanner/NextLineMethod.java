package day_13_scanner;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("please provide job title: ");
        String job_title = scan.nextLine();

        System.out.println(job_title);

    }
}
