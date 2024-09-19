package ClassDemos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance 
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
