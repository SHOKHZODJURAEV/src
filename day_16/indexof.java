package day_16;

public class indexof {
    public static void main(String[] args) {
        String sentence2 = "Java is a cool language";
        //        index:    01234567890123456789
        int indexOfFirstA = sentence2.indexOf("a");
        int indexOfSecondA = sentence2.indexOf("a ");
        int indexOfThirdA = sentence2.indexOf("a c");
        int indexOfFourthA = sentence2.indexOf("an");
        //int indexOfFifthA = sentence2.indexOf("ag");
        int indexofFifthA = sentence2.lastIndexOf("a")-1;
        String indexofSixth = sentence2.substring(indexofFifthA);
        String practice = sentence2.substring(4,2);

        System.out.println("indexOfFirst = "+indexOfFirstA);
        System.out.println("indexOfSecond = "+indexOfSecondA);
        System.out.println("IndexOfThird = "+indexOfThirdA);
        System.out.println("IndexOfFifth = "+indexofFifthA);
        System.out.println("Index of Fifth = "+indexofSixth);
        System.out.println(practice);


    }
}
