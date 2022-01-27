package week2.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
				
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
int range=8;
int firstNum=0;
int secNum=1;
System.out.println(firstNum);
System.out.println(secNum);
for (int i=1;i<range;i++)
{
	
	int sum=firstNum+secNum;
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
	
}		

	}

}
