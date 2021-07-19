package day04_Variable;

public class Concatenationclasses {

    public static void main(String[] args) {
        /*
        +:
        additional: when we have two numbers
        10 + 10= 20
         */
        String word = "Python";

        System.out.println("My favorite language is  " + word + " programming language.");
        System.out.println("__________________");

        int dollar = 100;
        double lira = dollar * 8.41;
        double yuan = dollar * 6.68;
        System.out.println(dollar+" currency:"+lira+"$" );
        System.out.println( dollar + "US dollars equal to"+ yuan +"Chinese yuan");
        System.out.println("_--------------");

        int a = 10;
        int b = 10;
        int addition = a + b;
        int subtraction = a-b;
        int multiplication = a*b;

        // 10 + 20 = 30

        System.out.println(a + "+" + b +"="+addition);
        // 10 - 20 = -10
        System.out.println(a+"-"+b+"="+subtraction);
        System.out.println(a+"*"+b+"="+multiplication);

        System.out.println("-------------------");

        String name = "Shawn";
        String favoriteMusic = "Pop Music";
        String favoriteBook = "The Lean Startup";
        String favoriteSeries = "Suits";

        System.out.println("\t Hello, my name is "+ name +", my favorite music is \""+favoriteMusic+"\", my favorite book is \""+favoriteBook
                +"\", my favorite series is  \""+favoriteSeries+"\".");

        System.out.println("---------------------");
        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";
        System.out.println("Today is "+today+"\nToday's class is "+todayClass+"\nTomorrow is "+tomorrow
                +"\nTomorrow class is "+tomorrowClass);

        char gender = 80;
        System.out.println("Gender: "+gender);






    }
}
