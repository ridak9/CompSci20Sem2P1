/*

Program: CubesSum.java          Date: September 23, 2024

Purpose: Create a .........

Author: Your Name, 
School: CHHS
Course: Computer Programming 20
 

*/
package SkillBuilders;

import java.util.Scanner;

public class CubesSum 
{

	public static void main(String[] args) 
	{
		//Declaration
		int number;
		int digit = 0;
		int sumOfCubes = 0;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a positive integer: ");
		number = input.nextInt();
		
		
		//Calculate the sum of digits
		do
		{
			digit = number % 10;//Remainder number
			sumOfCubes = sumOfCubes + digit * digit * digit;
			number = number / 10;//Quotient number
			
			
		}while(number != 0);
		
		System.out.println("The sum of the cubes of the digits is: "
							+ sumOfCubes );
		
		
		
		
	}

}
/* Screen Dump

Enter a positive integer: 
4
The sum of the cubes of the digits is: 64


*/