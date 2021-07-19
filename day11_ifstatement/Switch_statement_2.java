package day11_ifstatement;

public class Switch_statement_2 {
    public static void main(String[] args) {
        String name = "chrome";

        switch(name){

            case"chrome":
                name="Browser is selected";
                break;
            case"firefox ":
                System.err.println("Browser was selected");
                break; // case closed;
            default:
                System.err.println(name+" invalid browser");
                System.out.println("-------------------");

        }


        int MonthName = 11;
        String name1 = "";

        switch(MonthName){

            case 1:
                name1 = " Jan";
                break;
            case 2:
                name1 = "Feb";
                break;
            case 3:
                name1 = "March";
                break;
            case 4:
               name1 = " April";
                break;
            case 5:
                name1 ="May";
                break;
            case 6:
                name1 = "June";
                break;
            case 7:
                name1 = " July";
                break;
            case 8:
                name1 = "August";
                break;
            case 9:
                name1 = "September";
                break;
            case 10:
                name1 = " October";
                break;
            case 11:
                name1 = "November";
                break;
            case 12:
                name1 = "December";
                break;

            default:
               name1 = "invalid number";


        }
        System.out.println("name1 = " + name1);








    }
}
