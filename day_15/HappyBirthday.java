package day_15;

public class HappyBirthday {
    public static void main(String[] args) {
        String sentence = "Java programming Language";
        //                  0123
        String name = sentence.substring(0, 3+1);

        System.out.println(name); // Java

        String s2 = "Cybertek School";
        // 0123456789

        String name2 = s2.substring (9,15); // school
        String name3 = s2.substring(9); //school
        String name4 = s2.substring (5,10); // tek S


        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);




    }
}
