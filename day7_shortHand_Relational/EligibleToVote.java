package day7_shortHand_Relational;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Bekzod";
        int age = 23;
        String citizen = "USA";
        int creditScore = 759;
        boolean eligibleToVote = age>=18 && citizen == "USA" && creditScore >= 700;

        System.out.println(name+"is eligible to vote for Biden: "+eligibleToVote);

    }
}
