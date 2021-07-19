package day6_UnaryOperators;

public class PostPrePractice {
    public static void main(String[] args) {

        int a = 1; // a=1
        a= -a-- + a++ / -a-- * --a;
        System.out.println("a;"+a);
        int y = 50;
        int z = -y++ + --y - ++y + y--;
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("-----------");

        int p = 100;
        System.out.println(++p);
        System.out.println("-------------");

        int T = 80;
        int b = -T++ - T-- + --T + T--;
        System.out.println("T = " + T);
        System.out.println("b = " + b);


    }
}
