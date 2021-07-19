package day9;

public class GrafeReport {
    public static void main(String[] args) {
        int score = 50;
        if (score>=90 && score<=100){    // only score>=90
            System.out.println(score+" is A");
        } else if(score>=80 && score<=89) {    // only score>=80
            System.out.println(score + " is B");
        }else if(score>=70 && score<=79) {     // only score>=70
            System.out.println(score + " is C");
        }else if(score>=60 && score<=69) {      // only score>=60
            System.out.println(score + " is D");
        }else{
            System.out.println(score + " is Failed");
        }
}
    }
