package day10_ifstatement;

public class Ternary {
    public static void main(String[] args) {
        int age =21;
        String result = (age >= 21) ? "eligible" : "Not eligible";
        /*
        if(age >= 21){
            result = "Eligible";
        }else{
            result = "not eligible";
        }

        System.out.println();
        
         */
        System.out.println("result = " + result);

    }
}
