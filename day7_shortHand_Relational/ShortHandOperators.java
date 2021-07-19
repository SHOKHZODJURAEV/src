package day7_shortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {
        String name1 = "Sherzod";
        String name2 = "Bekzod";

        name2 = name1;
        name1 = name2;

        System.out.println(name1+" and "+ name2);// sherzod and sherzod

        int a = 200;
        a = 100 + 300;

        System.out.println("a = " + a);
        int bek = 10;
        bek+=10;
        System.out.println("bek="+bek);

        int balance = 300;
        balance += 200;
        System.out.println("balance = " + balance);

        String school = "Cybertek";
        school += " School";

        System.out.println("school = " + school);

        System.out.println("-------------");

        double salary = 100000;
        salary *= 2;
        salary *= 1.5;
        salary *= 0.65;

        System.out.println("salary = " + salary);

        System.out.println("--------");

        double slices =  10;
        slices /= 3;
        System.out.println("slices = " + (int) slices);

        int yeardays = 365;
        yeardays/=12;
        System.out.println(yeardays);
        yeardays%=12;

        System.out.println("month in one year: "+yeardays);
        System.out.println((double)365-12*30);
        System.out.println(12*30);








    }
}
