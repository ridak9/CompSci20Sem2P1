package ClassDemos;

import java.util.Scanner;

public class RectangleP 
{

	public static void main(String[] args) 
	{
		
		Scanner userInput = new Scanner(System.in);
		
		//Declaration and initialization
		System.out.print("Please enter a length value: ");
		int length = userInput.nextInt();
		
		System.out.print("Please enter a width value: ");
		int width = userInput.nextInt();
		
		int area = length * width;
		
		System.out.print("The area of the rectangle is: "+ area);
		
		
	}

	
	
	
	
}
