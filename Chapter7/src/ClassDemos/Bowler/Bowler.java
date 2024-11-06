package ClassDemos.Bowler;

public class Bowler 
{
	private int score;
	private String bowlerName;
	
	//Constructor
	public Bowler(String name)
	{
		score = 0;
		bowlerName = name;
	}
	
	public void takeTurn()
	{
		int pinsKnockedOver = 0;
		int pinsRemaining = 10;
		int pins = 0;
		int numThrows = 1;
		boolean strike = false;
		
		//Bowl a frame
		
		do
		{
			pins = (int)(pinsRemaining * Math.random() + 1);
			
			if(pins == 10)
			{
				strike = true;
			}
			pinsKnockedOver += pins;
			pinsRemaining -= pins;
			System.out.println(bowlerName + " knocked over " + pins + " pins.");
			numThrows += 1;
			
		}while( !strike && numThrows <= 2);
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String getName()
	{
		return bowlerName;
	}

}
