package day_15;

public class theSecondStringMethod {
    public static void main(String[] args) {
        String s = "cybertek";
        s =  s.toUpperCase();
        System.out.println(s);

        System.out.println("-------------");

        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s2.toLowerCase();
        System.out.println(s2);

        System.out.println("-----------------------------");

        String schoolName = "         Cybertek School  123        ";
        schoolName = schoolName.trim();


        System.out.println(schoolName);

    }
}
