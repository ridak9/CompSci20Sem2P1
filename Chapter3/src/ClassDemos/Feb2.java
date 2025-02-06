package ClassDemos;

import java.util.Scanner;

public class Feb2 
{

	public static void main(String[] args) 
	{
		double length, width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		
		length = input.nextDouble();
		
		System.out.println("Enter the width: ");
		
		width = input.nextDouble();
		
		double Area = length * width;
		
		
		System.out.println("The area of the rectangle is: "+ Area);
		
		
		
		
		
	}

}
