package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1="stops";
		String text2="potss";
		int len1=text1.length();
		int len2= text2.length();
		boolean status=true;
		if(len1!=len2)
				{
			status = false;
				}
			else
			{
			char[] str1=text1.toLowerCase().toCharArray();
			char[] str2=text2.toLowerCase().toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			 status=Arrays.equals(str1,str2);
			}
			if(status)
			{
				System.out.println(text1 + " and " + text2 + " are anagrams");
			}
				else
				{
					System.out.println(text1 + " and " + text2 + " are not anagrams");
				}	
			}



}