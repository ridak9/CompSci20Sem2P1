package ClassDemos;

import java.text.NumberFormat;
import java.util.Scanner;

public class Feb12 
{

	public static void main(String[] args) 
	{
		final int DOZEN = 12; //constant variable
		int numPurchased;//Keep track of purchases
		int numDozen, numExtra; //number of dozen and extra eggs
		double price, total;//Keep track of price and total number
		
		//Format the currency variable
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		//Preparing for user input
		Scanner input = new Scanner(System.in);
		
		//Ask the user for the number of eggs
		System.out.println("Enter the number of eggs purchases: ");
		
		numPurchased = input.nextInt();//Record eggs purchased
		
		numDozen = numPurchased / DOZEN;
		numExtra = numPurchased % DOZEN;
		
		if(numDozen < 4)//if this is true then go inside the block
		{
			price = 0.50;
		}
		else if(numDozen >= 4 && numDozen < 6)//Otherwise check the range 4-5
		{
			price = 0.45;
		}
		else if(numDozen >= 6 && numDozen < 11)//Otherwise check the range 6-10
		{
			price = 0.40;
		}
		else //Default case price is $.35
		{
			price = 0.35;
		}
		
		//Calculate the total amount due
		total = ((price * numDozen) + (numExtra * (price / 12)));
		//Output to the screen the formatted total
		System.out.println(money.format(total));
		
		
		
		
		
	}

}
/* Screen Dump
 
Test Case 1:
Enter the number of eggs purchases: 
7
$0.29


Test Case 2:
Enter the number of eggs purchases: 
12
$0.50

*/
