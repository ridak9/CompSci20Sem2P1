/*

Program: ConditionalStatement.java          Date: September 16, 2024

Purpose: Create a Grade application that prompts the user for the percentage earned on a test or other graded work and then displays the corresponding letter grade.

Author: Your Name, 
School: CHHS
Course: Computer Programming 20
 

*/



package SkillBuilders;

import java.text.*;
import java.lang.*;
import java.util.Scanner;

public class AccountSetup 
{

	public static void main(String[] args) 
	{
		//Declaration
		String userName, password;
		
		//Allows you to format any decimal number
		DecimalFormat dc = new DecimalFormat("0.0");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a username: ");
		userName = input.nextLine();
		userName = userName.toLowerCase();
		
		//Prompt and record the user for password
		System.out.println("Enter a password that is at least 8 characters: ");
		password = input.next();
		
		while(password.length() < 8)
		{
			System.out.println("Enter a password that is at least 8 characters: ");
			password = input.next();
		}
		
		//Convert the password input to lower case characters
		password = password.toLowerCase();
		
		//Display the username and password
		System.out.println("Your name is "+ userName +
							" and your password is " +
							password);
		
		
		
	}

}


/* Screen Dump


 
 */

