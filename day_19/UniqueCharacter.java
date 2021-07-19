package day_19;

public class UniqueCharacter {
    public static void main(String[] args) {

        String name = "aabcc";
        String result = "";

        for (int i = 0; i <= name.length()-1; i++) {
            char Zulayho = name.charAt(i); // a, a, b, c, c
            boolean Unique = name.indexOf(i) == name.lastIndexOf(i);

            if(Unique){
                result+= Zulayho;
            }

        }
        System.out.println(result);

    }
}
