package ClassDemos;

import java.util.Scanner;

public class Feb20 
{

	public static void main(String[] args) 
	{
		String text, lowerCaseText;
		String letter;
		
		int vowelSum = 0;
		
		//Preparing for user input 
		Scanner input = new Scanner(System.in);
		

		//Ask the user for the number of eggs
		System.out.println("Enter text: ");
		text = input.nextLine();
		
		lowerCaseText = text.toLowerCase();
		
		for(int i = 1; i <= lowerCaseText.length(); i++)
		{
			letter = lowerCaseText.substring(i-1, i);
			
			if(letter.equals("a") || letter.equals("e") || 
					letter.equals("i") || letter.equals("o") ||
					letter.equals("u")) 
			{
				vowelSum = vowelSum + 1;
				
			}
			
		}
		System.out.println("The number of vowels in "+ 
					text + " is "+ vowelSum + ".");
		
		

	}

}
