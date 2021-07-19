package day_19;

public class Finra {
    public static void main(String[] args) {

        String result = "";

        for (int i = 1; i <= 100 ; i++) {

            if(i%15 == 0){
                result = "FINRA";
            }else if(i%3 == 0){
                result = "FIN";
            }else if(i%5 == 0){
                result = "RA";
            }else{
                result = i+" ";
            }
        }
        System.out.println(result);
    }
    /*public static void main(String[] args) {
        for(int i = 1; i<= 100; i++){
            if(i%15==0){
                System.out.print("FINRA"+" ");
            }else if(i%3==0){
                System.out.print("Fin"+" ");
            }else if(i%5==0){
                System.out.print("RA"+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
     */
}
