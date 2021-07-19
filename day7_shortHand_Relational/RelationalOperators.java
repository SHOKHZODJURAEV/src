package day7_shortHand_Relational;

public class RelationalOperators {
    public static void main(String[] args) {
        // >
        System.out.println(4>2);

        int a = 100;
        boolean b = a/10<=0;
        System.out.println("b = " + b);

        int D = 100;
        D %=10;

        System.out.println("D = " + (double) D);

        String name1 = "Sahro",
        name2 = "Group",
        name3 = name2;


        name2 = name1;

        System.out.println(" \""+name2+"\" is a music "+name3+".");

        System.out.println("-------------");
        byte Hour = 15;
        Hour *=2;

        System.out.println(Hour);







    }


}
