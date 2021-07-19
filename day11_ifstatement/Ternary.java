package day11_ifstatement;

public class Ternary {
    public static void main(String[] args) {
        double salary = 60000;
        double creditScore = 550;
        String result = (salary>=60000 && creditScore>=650)? "Loan Approved": "Loan Denied";

        System.out.println("result = " + result);
        System.out.println("----------------------");

        String name = "Tennis";
        int Fee = 100;
        String Feeresult;

        System.out.println("----------------");

        int number1 = 500;
        int number2 = 200;
        int number3 = 300;
        String resultnumber = (number1>=number2 && number1>= number3)?number1+" one is the bigger":
                (number2>=number1&&number2>=number3)? number2+" is the bigger": number3+" is the bigger";

        System.out.println("resultnumber = " + resultnumber);
        System.out.println("------------");
        String Batch = "evening";
        String ResultBatch = (Batch == "Morning")? "Class times are 10~5 EST, M T, Th, F" : " class times are 7~10 est. M, T, W, Th, S, S";
        System.out.println("ResultBatch = " + ResultBatch);


    }
}
