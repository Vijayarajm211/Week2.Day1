package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) 
	{
		//Declare a String
		String text1="stops";
		//Declare another String
		String text2="potss";
		boolean status=false;
		int length = text1.length();
		int length2 = text2.length();
		System.out.println(text1 +  "Length is: "+length);
		System.out.println(text2 +  "Length is: "+length2);
		//Check length of the strings are same then
		if(length==length2) 
		{
			//Convert both Strings in to characters
			
			char[] charArray = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();
			//Sort Both the arrays
			
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			
			System.out.println(charArray);
			System.out.println(charArray2);
			if (Arrays.equals(charArray, charArray2)) 
			{
				status=true;
				System.out.println(status);
			} 
			else 
			{
				System.out.println(status);
			}
		}
	}

}