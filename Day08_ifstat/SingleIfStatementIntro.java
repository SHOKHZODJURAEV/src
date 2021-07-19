package Day08_ifstat;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        String name = "Bekzod";
        int score = 95;
        boolean passed = score >= 60;
        if (passed) {
            System.out.println(name+"Conrats you passed the exam");

        }
        if (!passed) {
            System.out.println(name+"You failed the exam");
        }
    }
}
