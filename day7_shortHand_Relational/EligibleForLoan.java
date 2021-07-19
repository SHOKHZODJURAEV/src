package day7_shortHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {
        String name= "Shawn";
                int age = 27;
        double income = 60000;
        double workhistory = 3;
        double creditscore = 750;
        boolean EligibleForLoan = age>=18 && income >= 32000 &&
                 workhistory >= 3 && creditscore >= 600;
        System.out.println(name+" is eligible for loan: " + EligibleForLoan);


    }

}
