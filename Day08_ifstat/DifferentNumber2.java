package Day08_ifstat;

public class DifferentNumber2 {
    public static void main(String[] args) {
        int num1= 40;
        int num2= 30;

        if(!(num1>num2)){
            System.out.println(num1+" is minimum number");
        }
        if (!(num2>num1)){
            System.out.print(num2+ " is minimum number");
        }
    }
}
