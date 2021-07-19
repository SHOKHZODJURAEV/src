package day10_ifstatement;

public class gradeReport {
    public static void main(String[] args) {
        int score = 90;
        String grade = "";

        if (score <= 100 && 0 <= score){

         if (score <= 100 && score >= 90){
            grade = "A";
         }else if(score >= 80){
            grade = "B";
         }else if(score >= 70){
            grade = "C";
         }else if(score >= 60){
            grade = "D";
         }else{
            grade = "Failed";
         }
        
       }else{
            grade = "Invalid";

        }
        System.out.println("grade = " + grade);

    }
}
