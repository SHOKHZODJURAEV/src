package day_15;

public class Practice33 {
    public static void main(String[] args) {

        String sentence = "Java Language";
        // index:          01234
        String name = sentence.substring(0);

        System.out.println("name = " + name);

        String name2 = "Cybertek School";
        String name5 = name2.substring(0, 10+5);

        System.out.println(name5);
    }
}
