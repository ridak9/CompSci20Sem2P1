package ClassDemos;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		int max = 0;
		int sum = 0;
		int step = 2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a maximum value: ");
		max = input.nextInt();
		
		for(int i = 1; i <= max; i += 2)
		{
			sum = sum + i;
		}
		System.out.println("Sum = "+ sum);
		


	}

}
