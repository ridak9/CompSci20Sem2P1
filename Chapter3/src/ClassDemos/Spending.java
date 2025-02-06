package ClassDemos;

import java.text.NumberFormat;
import java.util.Scanner;

public class Spending 
{

	public static void main(String[] args) 
	{
		double food, clothing, entertainment, rent;
		
		double totalExpenditure, foodP, clothingP, entertainmentP, rentP;
		
		 // Create a Scanner object to read input from the user
	    Scanner input = new Scanner(System.in);
	    
	    // Prompt the user for amount spent on food
	    System.out.println("Food:  $");
	    
	    food = input.nextDouble();
	    
	    System.out.println("Clothing:  $");
	    
	    clothing = input.nextDouble();
	    
	    System.out.println("Entertainment:  $");
	    
	    entertainment = input.nextDouble();
	    
	    System.out.println("Rent:  $");
	    
	    rent = input.nextDouble();
	    
	    totalExpenditure = (food + clothing + entertainment + rent);
	    
	    foodP = food / totalExpenditure;
	    clothingP = clothing / totalExpenditure;
	    entertainmentP = entertainment / totalExpenditure;
	    rentP = rent / totalExpenditure;
	    
	    NumberFormat nf = NumberFormat.getPercentInstance();
	    NumberFormat nc = NumberFormat.getCurrencyInstance();
	    
	    
	    System.out.println("Category \t\t\t Budget");
	    System.out.println("Food: " + nc.format(food) + "\t\t\t " + nf.format(foodP));
	    System.out.println("Clothing: " + nc.format(clothing) + "\t\t\t " + nf.format(clothingP));
	    System.out.println("Entertainment: " + nc.format(entertainment) + "\t\t\t " + nf.format(entertainmentP));
	    System.out.println("Rent: " + nc.format(rent) + "\t\t\t " + nf.format(rentP));

	    
		
		
		
	}

}
