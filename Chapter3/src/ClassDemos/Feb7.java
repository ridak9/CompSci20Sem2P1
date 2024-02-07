/*
Program: Feb7.java          Date: February 7, 2024

Purpose: Create an application that prompts the user for
  		 three distances and calculates the total distance.

Author: Your Name 
School: CHHS
Course: Computer Science 20
 
*/

package ClassDemos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Feb7 
{

	public static void main(String[] args) 
	{
		//Declaration Area
		double firstD, secondD, thirdD, totalD;
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Ask the user for first distance
		System.out.println("Enter the distance for the first segment: ");
		firstD = input.nextDouble();//Record the first segment
		
		//Ask the user for second distance
		System.out.println("Enter the distance for the second segment: ");
		secondD = input.nextDouble();//Record the second segment
		
		//Ask the user for third distance
		System.out.println("Enter the distance for the third segment: ");
		thirdD = input.nextDouble();//Record the third segment
		
		//Calculate the total distance
		totalD = firstD + secondD + thirdD;
		
		//Output the total distance to the console
		System.out.println("The total distance of the race is: "
				+ dc.format(totalD));
		
		

	}

}
/*Screen Dump
 
 Test Case 1:
 Enter the distance for the first segment: 
3.5
Enter the distance for the second segment: 
2.7
Enter the distance for the third segment: 
5.2
The total distance of the race is: 11.4
 
 
 
 Test Case 2:
 Enter the distance for the first segment: 
6.7
Enter the distance for the second segment: 
8.3
Enter the distance for the third segment: 
5
The total distance of the race is: 20.0
*/
