package Day08_ifstat;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;
       if(score>=90 && score <=100){
           System.out.println("Excellent, You made an A");
       }
        if(score>=80 && score<=89){
            System.out.println("good job, You made a B");
        }
        if(score>=70 && score<=79){
            System.out.println("good job, You made a C");
        }
        if(score>=60 && score <=69){
            System.out.println("Failed");
        }
    }
}
