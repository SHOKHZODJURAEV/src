package day_19;

public class Practice {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {

            if(i%15 == 0){
                System.out.print("FINRA");
            }else if(i%3 == 0){
                System.out.print("FIN");
            }else if(i%5 == 0){
                System.out.print("RA");
            }else{
                System.out.print(i+"  ");
            }
        }

        String one = "A";
        String two = "B";
        String result = "";
        result += "One";
        result += "four";
        result += "six";
        result += "seven";
        result += "nine";
        System.out.println();

        System.out.println(result);

    }
}
