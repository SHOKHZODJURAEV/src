package day9;

public class DaysinMonths {
    public static void main(String[] args) {
        int month = 12;

        if(month == 2){
            System.out.println(month+" is 28 days");
        }else if(month == 4|| month ==6|| month == 9 || month ==11) {
            System.out.println(month + " is 30 days");
        }else{
            System.out.println(month+" is 31 days");
        }
    }
}
