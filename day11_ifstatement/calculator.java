package day11_ifstatement;

public class calculator {
    public static void main(String[] args) {

        double n1 = 100;
        double n2 = 5.5;
        double result = 0;
        char mathOperator = '$';

        switch (mathOperator){
            case '+':
                result= 100+5.5;
                break;
            case '-':
                result= 100-5.5;
                break;

            case '*':
                result = 100*5.5;
                break;
            case '/':
                result=100/5.5;
                break;

            default:
                System.out.println("invalid number");

        }

        System.out.println("-----------");

        int number = 5;
        String name = "";

        switch(number){

            case 1 :
                name = "Monday";
                break;
            case 2 :
                name = "Tuesday";
                break;
            case 3 :
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sanday";
                break;
            default:
                name = "invalid number";
                break;


        }
        System.out.println("name = " + name);
    }
}
