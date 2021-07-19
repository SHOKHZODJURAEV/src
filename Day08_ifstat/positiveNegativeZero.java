package Day08_ifstat;

public class positiveNegativeZero {
    public static void main(String[] args) {
        int number = 0;
        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = !positive && !negative && number == 0;

        if (positive) {
            System.out.println("number is positive.");
        }
        if (negative) {
            System.out.println("Number is negative.");
        }
        if (zero) {
            System.out.println("Number is zero.");
        }
    }
}