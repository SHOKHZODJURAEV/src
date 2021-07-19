package day11_ifstatement;

public class New_project {
    public static void main(String[] args) {
        int age = 25;
        String agegroup = "";
        
        if(age>=0 && age<=150){
            if(age<21){
                agegroup= "Teenager";
            }else if (age<=55){
                agegroup="Adult";
            }else{
                agegroup="Senior";
            }
            
        }else{
            agegroup = "invalid Age";
            
        }
        System.out.println("agegroup = " + agegroup);
    }
}
