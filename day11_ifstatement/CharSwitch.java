package day11_ifstatement;

public class CharSwitch {
    public static void main(String[] args) {
        char level = 'A';
        String Name = "";

        switch(level){

            case 'A':
                Name = " excellent";
                break;

            case 'B':
                Name = "great job";
                break;

            case 'C':
                Name = "good";

            case 'D':
                Name = "passed";
                break;

            case 'F':
                Name = "Failed";
                break;

            default:
                Name = "Invalid";
        }
        System.out.println("Exam result :" + Name);
    }
}
