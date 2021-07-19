package day_15;

public class StringMethod2 {
    public static void main(String[] args) {
        String s1 = "Cybertek";
        int lastIndex = s1.length()-1; //in order to get the last index number we need to subtract one from the length of String
        char firstCharacter = s1.charAt(0);
        // char lastCharacter = s1.charAt(7);
        char lastCharacter = s1.charAt( lastIndex  );

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);
        System.out.println("-------------");
        String sentence = "Hello";
        int totalNumberOfChars = sentence.length();
        System.out.println("totalNumberOfChars = " + totalNumberOfChars);

        System.out.println("-------------");

        String sentence2 = "Java is a prgramming language";
        String name4 = sentence2.substring(10);
        System.out.println(name4);

        String name5 = sentence2.substring(10, 20+1);

        System.out.println(name5);
        System.out.println("----------------");

        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace( "Python",  "Java");

        System.out.println(sentence3);

        System.out.println("------------");

        String sentence5  = "Dog is friendly, Dog is loyal, I love Dogs";
        sentence5 = sentence5.replace("Dog", "Cat");

        System.out.println(sentence5);


    }
}
