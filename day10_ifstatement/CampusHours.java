package day10_ifstatement;

public class CampusHours {
    public static void main(String[] args) {
        int time = 23;
        String result = " ";

        if(time >= 8 && time <=23){
            result ="Open";
        }else{
            result = "Closed";
        }
        System.out.println("result = " + result);


    }
}
