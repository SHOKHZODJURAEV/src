package day_18;

public class StringMethodsPractice {
    public static void main(String[] args) {

        String str = "abcd";
        int number = str.indexOf("k");
        System.out.println("indexOfK = "+number);
        if(number>=0){
            System.out.println("The string has character k");
        }else{
            System.out.println("The string does not have k");
        }



        System.out.println("-----------------------------");
        String sentence = "I like to learn C#, C# is cool";
        // verify if the sentence has "Java"
        if(sentence.indexOf("Java")>=0){
            System.out.println("sentence has java");
        }else{
            System.out.println("sentence does not have java");
        }

        System.out.println("----------------------------");

        String sentence2 = "I love Java, C# is cool";


        System.out.println("----------------");

        String schoolName = "Cybertek School";
        String name  = schoolName.substring(0, schoolName.indexOf(" "));

        System.out.println("Name"+name);

        String sentence3 = "I live in Verginia, I go to Cybertek School";
        String name2 = sentence3.substring(sentence3.indexOf("Cy"), sentence3.lastIndexOf(" "));


    }
}
