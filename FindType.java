package week2.day2;

public class FindType {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] chr=test.toCharArray();
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for(int i=0;i<test.length();i++)
		{

			if(Character.isLetter(chr[i]))
			{
				letter++;
				
			}
			else if(Character.isDigit(chr[i]))
			{
				num++;
				
			}
			else if(Character.isSpaceChar(chr[i]))
			{
				space++;
				
			}
			else
				
			
				specialChar++;
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

		
	}

}
