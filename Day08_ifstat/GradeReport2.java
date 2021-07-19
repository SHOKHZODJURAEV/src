package Day08_ifstat;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 50;

        boolean madeA = score>= 90 && score <=100;
        boolean madeB = !madeA && score >=80;
        boolean madeC = !madeA && !madeB && score >=70;
        boolean madeD = !madeA && !madeB && !madeC && score >= 60;
        boolean madeF = !madeA && !madeB && !madeC && !madeD;

        if(madeA){
            System.out.println("Excellent A");
        }
        if(madeB){
            System.out.println("Perfect B");
        }
        if(madeC) {
            System.out.println("Good C");
        }
        if(madeD){
            System.out.println("no bad D");
        }
        if(madeF){
            System.out.println("Failed F"
            );
        }

        }

    }

