package ClassDemos;

import java.util.Scanner;

 /**
  * Determine what integers of two, three, and four digits are equal to the sum
  * of the cubes of their digits.
  */
 public class CubesSum_partB 
 {

	public static void main(String[] args) 
	{
		//Declaration 
		final int MAXNUM = 9999;
		int number;
		int sumOfCubes;
		int digit = 0;
		
		Scanner input = new Scanner(System.in);

		/* Display 2, 3, 4 digit numbers that equal sum of the cubes of their digits */
  		
		for(int i = 10; i <= MAXNUM; i++) 
		{
  			sumOfCubes = 0;
  			number = i;
			
  			/*sum the digits */
			do 
			{
				digit = number % 10;
				sumOfCubes += digit * digit * digit;
				number = number / 10;
			} while (number != 0);
			
			if (sumOfCubes == i) 
			{
				System.out.println("The sum of the cubes of the digits in " + i + " is " + sumOfCubes);
			}
		}
	}
}