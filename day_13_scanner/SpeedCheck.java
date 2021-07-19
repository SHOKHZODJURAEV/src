package day_13_scanner;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
       int speedLimit = 35;
        System.out.println("Enter your current speed:");
        int currentSpeed = new Scanner (System.in).nextInt();

        int overSpeed = currentSpeed-speedLimit;

        if(overSpeed>0){
            System.out.println("You are driving "+overSpeed+" miles over speed limit. please Slow down");
        }

    }
}
