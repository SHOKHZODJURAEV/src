package day_18;

import java.util.Locale;

public class Practice1 {
    public static void main(String[] args) {
        String s1 = "I love cats and dogs";

        //boolean lovesCats = s1.equalsIgnoreCase("cats"); // verifies if s1 IS "cats"
        boolean lovesCats = s1.toLowerCase().contains("cats"); //verifies if s1 has "cast"

    }
}
