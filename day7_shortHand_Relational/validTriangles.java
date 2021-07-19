package day7_shortHand_Relational;

public class validTriangles {
    public static void main(String[] args) {
        
        int angle1 = 60,
                angle2 = 90,
                angle3 = 75;
         boolean isValid = (angle1+angle2+angle3) == 180;
        System.out.println("isValid = " + isValid);
    }
}
