package ClassDemos;

public class Evens 
{

	public static void main(String[] args) 
	{
		final int maxValue = 50;
		
		int newValue = 0;
		
		System.out.println("Even numbers between 1-20");
		
		while( newValue < maxValue)
		{
			newValue += 2;
			
			System.out.println(newValue);
		}

	}

}
