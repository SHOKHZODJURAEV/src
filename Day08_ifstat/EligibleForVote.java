package Day08_ifstat;

public class EligibleForVote {
    public static void main(String[] args) {
        String name = "Sherzod";
        int age = 17;
        String citizen = "USA";

        boolean eligibile = age >=21 && citizen == "USA";

        if(eligibile){
            System.out.println(name+" is eligible to vote");
        }

        if(!eligibile){
            System.out.println(name+" is not eligible to vote");
        }


    }
}
