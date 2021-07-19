package day_15;

import java.sql.SQLOutput;

public class SubStringPractise {
    public static void main(String[] args) {

        String sentence = "My favorite series is The Walking Dead";
        String tvSeries = sentence.substring(22);


        System.out.println(tvSeries);
        System.out.println("---------------");

        String sentence2 = "Java is a fun language";
        String s1 = sentence2. substring(10,12+1);
        System.out.println(s1);
        String s2 = sentence2.substring(14);
        System.out.println(s2);
        System.out.println("-----------");

        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python","Java");

        System.out.println(sentence3);
        System.out.println("----------");

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";

        sentence4=sentence4.replace("C#","Java");

        System.out.println(sentence4);


    }
}
