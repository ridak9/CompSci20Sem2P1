/*

Program: ConditionalStatement.java          Date: September 16, 2024

Purpose: Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade.

Author: Your Name, 
School: CHHS
Course: Computer Programming 20
 

*/



package ClassDemos;

import java.text.*;
import java.lang.*;
import java.util.Scanner;

public class ConditionalStatement 
{

	public static void main(String[] args) 
	{
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		//Declaration area
		String guess;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Initialize the secret word
		String secretWord = "Calgary";
		
		//Prompt the user
		System.out.println("What is the secret word? ");
		
		//Record user input
		guess = input.next();
		
		//Check if the two variables are the same
		if(guess.equalsIgnoreCase(secretWord))
		{
			System.out.println("Correct");//output correct if TRUE
		}
		else
		{
			System.out.println("You've guessed it incorrectly");//FALSE case
		}
		
		
		int sqrtN = 7;
		int squared = (int)Math.pow((int)sqrtN, 2);
		
		if(sqrtN == squared)
		{
			System.out.println("The number is a perfect square");
		}
		
		
	}

}


/* Screen Dump

What is the secret word? 
Crescent
You've guessed it incorrectly

What is the secret word? 
Calgary
Correct

 
 */

