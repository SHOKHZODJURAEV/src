package day_15;

public class RepaetINTRO {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "CAt";
        String s3 = "Cat";

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println("--------------------");

        String s4 = new String("Dog");
        String s5 = new String("Dog");
        String s6 = new String("Dog");
        String s7 = "Dog";
        String s8 = s4;

        System.out.println(s4 == s5);
        System.out.println(s6);
        System.out.println(s8 == s4);
    }
}
