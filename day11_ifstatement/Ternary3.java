package day11_ifstatement;

public class Ternary3 {
    public static void main(String[] args) {
        int number1 = 600,
                number2 = 400,
                number3 = 300;
        String result = (number1>number2 && number1 > number3)? number1+" is greater number":
                (number2>number1 && number2>number3)? number2+" is greater": number3+" is greater";
        System.out.println("result = " + result);
    }
}
