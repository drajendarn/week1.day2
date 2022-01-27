package week2.day2;

public class PrimeNumbers {

	public static void main(String[] args)
	{
		
		int input=13;
		boolean flag=false;
		for (int i = 2; i < input/2; i++)
		{			
			if(input%i==0)
			{
				flag=true;//System.out.println(true);
				break;	
			}
			
		}			
			if(flag==false)
			{
			System.out.println("The number is a Prime Number");
			}
			else
			
				System.out.println("The number is not a Prime Number");
		}
			
		
	}
	

