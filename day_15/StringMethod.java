package day_15;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {

        String str = "Muhtar";
        char ch = str.charAt(0);
        System.out.println("ch = " + ch);
        System.out.println("------------");
        String name = "cybertek";
        String NAME = name.toUpperCase();
        System.out.println(NAME);
        System.out.println("------------------");

        String name1 = "JAVA PROGRAMMING";
        name1 =  name1.toLowerCase();

        System.out.println(name1);

        String space = "      Cybertek      ";
        space = space.trim();

        System.out.println(space);


    }
}
