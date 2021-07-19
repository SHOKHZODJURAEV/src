package day11_ifstatement;

public class PassOrFailed {
    public static void main(String[] args) {

        char grade  = 'A';

        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
