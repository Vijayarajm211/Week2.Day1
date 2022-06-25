package week2.day1.assignments;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		//Declare A String value as"madam"
		
		String A="Madam";   //String A="madam";
		//Declare another String rev value as
		String rev="";
		//Iterate over the String in reverse order
		
		for (int i = A.length()-1; i >=0; i--) 
		{
		//Add the char into rev
			
			rev=rev+A.charAt(i);
		}
		//Compare the original String with the reversed String, if it is same then print palinDrome
		
		if (A.equalsIgnoreCase(rev))    //if(A.equals(rev)) 
		{
			System.out.println("This is PalinDrome");
		}
		else
		{
			System.out.println("This is not PalinDrome");
		}
	}

}
