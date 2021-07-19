package day_15;

public class Reverse {
    public static void main(String[] args) {
        String word = "Black";
        String result = "";
        if(word.length()<5){
            result = "Short";
        }else if(word.length()>5){
            result = "Long";
        }else{
           /* result += word.charAt(4);
            result += word.charAt(3);
            result += word.charAt(2);
            result += word.charAt(1);
            result += word.charAt(0);
            */
            result = ""+ word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }
        System.out.println("result = " + result);

    }
}
