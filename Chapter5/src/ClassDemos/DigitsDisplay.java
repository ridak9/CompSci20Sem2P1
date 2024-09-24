package ClassDemos;


import java.util.Scanner;

/**
 * Displays non-negative integers on separate lines.
 */
public class DigitsDisplay 
{

	public static void main(String[] args) 
	{
		int numValue, digit;
		int maxDigits = 1000000000;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		numValue = input.nextInt();

		/* Reduce MaxDigits to equal number of digits in NumberValue */
		while(maxDigits > numValue) 
		{
		  maxDigits = maxDigits / 10;
		}

		/* Display digits */
		while(maxDigits >= 1) 
		{
	  		digit = numValue / maxDigits;
	  		System.out.println(digit);
	  		numValue = numValue % maxDigits;
	  		maxDigits = maxDigits / 10;
		}
	}
}