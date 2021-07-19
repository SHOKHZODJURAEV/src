package day_18;

public class Task2 {
    public static void main(String[] args) {
        String mainName = "shAHA_king9393@gmail.com";
        int firstname = mainName.indexOf("_"); // returns the index number of the underscore from the mail
        int lastName = mainName.indexOf("@"); // returns the index number of @ in email
        
        String First = mainName.substring(0,firstname);
       // First = First.substring(0,1).toUpperCase()+First.toLowerCase().substring(1);
        First = (""+First.charAt(0)).toUpperCase()+First.substring(1).toLowerCase();

        String Second = mainName.substring(firstname+1,lastName);
        //Second = Second.substring(0,1).toUpperCase()+Second.substring(1).toLowerCase();
        Second = (""+Second.charAt(0)).toUpperCase()+Second.substring(1).toLowerCase();
        String domain = mainName.substring(lastName+1,mainName.indexOf("."));

        System.out.println("First = " + First);
        System.out.println("Second = " + Second);
        System.out.println("domain = " + domain);

    }
}
/*
Assume that email address is constructed by person's first name and followed by an underscore and last name.
		Write a program that will print out information about user based on email. Print first name, last name, and domain.
	   	First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

   			Ex:
   				input:
   					craig_federighi@apple.com

				Output:
					First name: Craig
					Last name: Federighi
					Domain: apple
 */
