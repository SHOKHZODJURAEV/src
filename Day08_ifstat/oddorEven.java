package Day08_ifstat;

public class oddorEven {
    public static void main(String[] args) {
        int number = 50;

        boolean odd = number%2 !=0;
        if(odd){
            System.out.println(number+" is odd number");}
            if(!odd){
                System.out.println(number+" is even number");
            }


    }
}
