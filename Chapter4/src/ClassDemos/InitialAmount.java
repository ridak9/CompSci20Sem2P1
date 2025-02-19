package ClassDemos;

import java.text.NumberFormat;
import java.util.Scanner;

public class InitialAmount 
{

	public static void main(String[] args) 
	{
		double y, n, k, t;
		int choice;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Format the currency variable
		NumberFormat decimal = NumberFormat.getNumberInstance();
		
		System.out.println("1. Final Amount");
		System.out.println("2. Initial Amount");
		System.out.println("3. Constant (half-life");
		
		System.out.println("Find: ");
		choice = input.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println("Enter the initial mass: ");
				n = input.nextDouble();
				
				System.out.println("Enter the constant: ");
				k = input.nextDouble();
				
				System.out.println("Enter the elapsed time in year: ");
				t = input.nextDouble();
				
				y = n * (Math.exp(k*t));
				
				System.out.println("The final amount will be " + 
											decimal.format(y));
				break;
			}
			
			case 2:
			{
				System.out.println("Enter the final mass: ");
				y = input.nextDouble();
				
				System.out.println("Enter the constant: ");
				k = input.nextDouble();
				
				System.out.println("Enter the elapsed time in year: ");
				t = input.nextDouble();
				
				n = y / (Math.exp(k*t));
				
				System.out.println("The final amount will be " + 
											decimal.format(n));
				
				break;
			}
			
			case 3:
			{
				System.out.println("Enter the final mass: ");
				y = input.nextDouble();
				
				System.out.println("Enter the initial mass: ");
				n = input.nextDouble();
				
				System.out.println("Enter the elapsed time in year: ");
				t = input.nextDouble();
				
				k = (Math.log(y/n)) / t;
				
				System.out.println("The final amount will be " + 
											decimal.format(k));
				
				break;
			}
			
			
		}
	}

}
