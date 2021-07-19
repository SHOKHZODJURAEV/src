package day10_ifstatement;

public class oneToNine {
    public static void main(String[] args) {
       int number = 100;
       String name = "";

       if (number>=1 && number<=9) {

           if (number == 1) {
               name = "one";
           } else if (number == 2) {
               name = "two";
           } else if (number == 3) {
               name ="three";
           } else if (number == 4) {
               name = "four";
           } else if (number == 5) {
               name = "five";
           } else if (number == 6) {
               name = "six";
           } else if (number == 7) {
               name = "seven";
           } else if (number == 8) {
               name = "eight";
           } else {
               name = "nine";
           }
       }else {
           name = " not match number";
       }
        System.out.println("name = " + name);
    }
}
