package day_13_scanner;



public class LetterOrDigitOrSpecialChar {

    public static void main(String[] args) {

        System.out.println("Enter please character:");
        char ch = '1'; // ch >= '0' && ch <='9';
        boolean isDigit = ch>=48 && ch <= 57;
        boolean isLetter = (ch>= 'A' && ch<= 'Z')|| (ch>='a' && ch <='z');

       // boolean isSpecialCharacter = !isDigit && !isLetter;

        String result = (isDigit)? ch+" is digit":(isLetter)? ch+" is letter": ch+" is special character";
       /* if(isDigit){
            result= ch+" is digit";
        }else if(isLetter){
            result = ch+"is letter";
        }else{
            result = ch+" is special character";
        }
        */
        System.out.println(result);


    }
}
