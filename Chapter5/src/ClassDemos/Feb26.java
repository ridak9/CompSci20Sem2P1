package ClassDemos;

public class Feb26 
{

	public static void main(String[] args) 
	{
		int randNum;
		int sequenceLength = 0;
		String last = "aab";
		
		char a = last.ct
		
		do
		{	//Generate random numbers between 1 - 11
			randNum = (int)(11 * Math.random());
			
			//Output each random number
			System.out.println(randNum + " ");
			
			sequenceLength += 1;//increment the sequenceLength by 1			
			
		}while(randNum != 0);
		
		System.out.println("\n Length of sequence was "+sequenceLength);

	}

}
