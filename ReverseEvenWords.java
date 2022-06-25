package week2.day1.assignments;

import java.util.Iterator;

public class ReverseEvenWords {
	public static void main(String[] args) 
	{
		//Declare the input as Follow
		String test = "I am a software tester";
		String temp = "";
		String rev="";
		//split the words and have it in an array
		String[] split = test.split(" ");
		//char[] chArray = test.toCharArray();
		//Traverse through each word (using loop)
		for (int i = 0; i <=split.length-1; i++)  // 2,2<4,
		{
			
			//find the odd index within the loop (use mod operator)
			if (i%2==1) 
			{
				char[] chArray = split[i].toCharArray();
				for (int j = chArray.length-1; j >=0; j--) 
				{
					rev=rev+chArray[j];  // m a
				}
			
				temp=temp+rev+" "; // ma
			}
			
			else
			{
				temp=temp+split[i]+" "; // I
			}
		}
		
		System.out.println(temp);
	}

}
