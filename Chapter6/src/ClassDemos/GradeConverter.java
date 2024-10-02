package ClassDemos;

import java.util.Scanner;

public class GradeConverter 
{

	//Checks to see if a given number is valid or not
	public static boolean isValidNumber(int userNum, int minNum, int maxNum)
	{
		if(minNum <= userNum && userNum <= maxNum)
		{
			return(true);
		}
		else
		{
			//
			return(false);
		}
	}
	
	
	public static String getLetterGrade(int numGrade)
	{
		if(numGrade < 60) 
		{
			return("F");			
		}
		else if(numGrade < 70)
		{
			if(numGrade == 69)
			{
				return("D+");
			}
			else
			{
				return("D");
			}
		}
		else if(numGrade < 80)
		{
			if(numGrade == 79)
			{
				return("C+");
			}
			else
			{
				return("C");
			}
		}
		else if(numGrade < 90)
		{
			if(numGrade == 89)
			{
				return("B+");
			}
			else
			{
				return("B");
			}
		}
		else
		{
			return("A+");
		}
	}
	
		
	
	public static void main(String[] args) 
	{
		//Declaration
		final int FLAG = -1;
		final int minValue = 0;
		final int maxValue = 100;
		int numericGrade;
		String letterGrade;
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Prompt and record user input
		System.out.println("Enter a numeric grade (-1 to quit): ");
		numericGrade = input.nextInt();
		
		while(numericGrade != FLAG)
		{
			//Making a call to isValidNumber method
			if(isValidNumber(numericGrade, minValue, maxValue))
			{
				//Making a call to getLetterGrade method
				letterGrade = getLetterGrade(numericGrade);
				
				System.out.println("The grade "+
									numericGrade +
									" is a(n) "+ letterGrade + "." 
									);
				
			}
			else
			{
				System.out.println("Grade entered is not valid. ");
			}
			
			//Prompt and record user input again for the while loop
			System.out.println("Enter a numeric grade (-1 to quit): ");
			numericGrade = input.nextInt();
		}
		System.out.println("End of program!");
		
		

	}

}
