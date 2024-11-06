package ClassDemos.Bowler;

import java.util.Scanner;

public class Bowling 
{

	public static void main(String[] args) 
	{
		Bowler b1 = new Bowler("You");
		Bowler b2 = new Bowler("Computer");
		
		Scanner input = new Scanner(System.in);
		
		int frames = 1;
		
		while(frames <= 10)
		{
			b1.takeTurn();
			System.out.println("Score is: " + b1.getScore());
			
			b2.takeTurn();
			System.out.println("Score is: " + b2.getScore());
			
			frames += 1;
		}
		
		if(b1.getScore() > b2.getScore())
		{
			System.out.println(b1.getName() + "WINS!");
		}
		else if(b2.getScore() > b1.getScore())
		{
			System.out.println(b2.getName() + "WINS!");
		}
		else
		{
			System.out.println("It's a tie. ");
		}

	}

}
