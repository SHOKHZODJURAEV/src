package day_16;

public class StringMethod {
    public static void main(String[] args) {
        String email = "cybertek@yahoo.com";
        email = email.replace("Yahoo,", "gmail");//"Cybertek@gmail.com

        System.out.println(email);
        //sentence = sentence.replace("C#", "Java"); //replace all the matchinng only

        String sentence = "C# is cool, C# is fun";
        //sentence = sentence.replaceFirst ("C#", "Java"); // replaces the first matching only

        sentence = sentence.replaceFirst(", C#", ", Java");// just for String

        System.out.println(sentence);

        String s = "Cat Dog Cat Dog Cat";
        s= s.replaceFirst("Cat", "Dog");

        System.out.println(s);

        System.out.println("--------------------");
        String s2 = "          ";
        s2 = s2.trim(); //""
        boolean r1 = s2.isEmpty();
        System.out.println("r1 = "+r1);

        System.out.println("-----------------");
        //equal(), equalsIgnoreCase()

        String str1 = "Cat"; // string pool
        String str2 = new String("Cat"); // Java Heap
        String str3 = new String("Cat"); // Java Heap

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str2 == str3); //false
        System.out.println(str2.equals(str3)); // true

        System.out.println("----------------------");

        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2); // false: two different object
        System.out.println(word1.equals(word2)); //false: case sensitivity

        System.out.println(word1.equalsIgnoreCase(word2));//true








    }
}
