package week2.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
			int[] arr = {1,2,3,4,7,6,8};
            Arrays.sort(arr);
            int count=0;
               
              for (int i = arr[0]; i < arr.length; i++) {
            	  
            	  if(i==arr[count])
            	  {
						count++;
            	  }
            	else
            	{
            		System.out.println(i);
            	}
				
            	  
            	  				
              }						
						
	}

}
