package day11_ifstatement;

public class nestedIfPractice {
    public static void main(String[] args) {

        String name = "US Morning";
        String result = "";
        boolean isValid = name == "US Morning" || name == "US Evening"||
                name == "EU";
        if(isValid){
            if(name == "US Morning"){
                result = "class times are 10-5 EST. M, T, Th, F";
            }else if(name == "US Evening"){
                result= "class times are 7-10 EST. M, T, W, Th, S, S";
            }else{
                result= "10am-5pm EST. M, T, W, Th, F";
            }
        }else {
            result = "Try once again";
        }
        System.out.println("result = " + result);
    }
}
