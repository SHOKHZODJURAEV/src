package day6_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 100;
        ++a;
        System.out.println(a);

        int b = 100;

        --b;
        System.out.println(b);
        int c = 100;
        System.out.println(c--);
        System.out.println(c);
        System.out.println(c--);
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
        System.out.println(b);
        System.out.println(++b);

        System.out.println("---------");
        int y = 100;
        int result = y++ + 1;

        System.out.println(result);
        System.out.println(y);

        int z = 100;
        int result2 = ++z + 1;
        System.out.println(result2);
        System.out.println(z);
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);
        System.out.println("------------------");

        int R = 5;
        int Result = ++R + 1;
        System.out.println("Result = " + Result);
        System.out.println("R = " + R);
        int R1 = 5;
        int Result1 = --R1-1;
        System.out.println("R1 = " + R1);
        System.out.println("Result1 = " + Result1);


    }


}
