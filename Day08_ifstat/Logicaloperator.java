package Day08_ifstat;

public class Logicaloperator {
    public static void main(String[] args) {
        int score = 80;
        boolean passed = score >= 60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        System.out.println(true == !false);
        System.out.println(!false == !false);
    }
}
