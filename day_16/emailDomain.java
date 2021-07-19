package day_16;

import java.util.Scanner;

public class emailDomain {
    public static void main(String[] args) {
        String email = "Cybertek@gmail.com";

        int beginningIndex = email.indexOf("@");
        int endingIndex = email.indexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);
        System.out.println(endingIndex);
        System.out.println(beginningIndex);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Gmail.com");
        String name = scan.next();

        int beginningEmail = name.indexOf("@");
        int endingEmail = name.indexOf(".");
       String domain2 = name.substring(beginningEmail,endingEmail);

        System.out.println(domain2);



    }
}
