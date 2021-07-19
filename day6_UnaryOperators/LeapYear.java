package day6_UnaryOperators;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2023;
        boolean isleapyear = year%4==0;

        System.out.println(year+" is a leap year "+isleapyear);

    }
}

/*
create a class named LeapYear, and write a program that can
identify if the given is Leap Year, print true if it's
 leap year, otherwise print false
 */