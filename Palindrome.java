package week2.day2;

public class Palindrome {

	public static void main(String[] args) {
        String original="madam";

        String  reverse = "";  

        int length = original.length();  

        for ( int i = length - 1; i >= 0; i-- ) 

           reverse = reverse + original.charAt(i); 

        if (original.equals(reverse)) 

           System.out.println("Entered string is a palindrome."); 

        else 

           System.out.println("Entered string isn't a palindrome.");  



	}

}
