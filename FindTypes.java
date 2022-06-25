package week2.day1.assignments;

public class FindTypes {
	public static void main(String[] args) 
	{
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		int length = test.length();
		System.out.println("Length is:" + length);
		//Convert the String to character array
		char[] testchar = test.toCharArray();
		// Reverse through each character (using loop)
		for (int i =testchar.length-1; i>=0; i--) 
		{
			if (Character.isLetter(testchar[i])) 
			{
				letter++;     // Count of Letter   
			}
			else if (Character.isDigit(testchar[i])) 
			{
				num++;        // Count of num  
			}
			else if (Character.isSpaceChar(testchar[i])) 
			{
				specialChar++;   // Count of space
			}
			else
			{
				space++;    // Count of specialCharacter
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
	}

}
