package ClassDemos;

public class DisplayBox 
{

	
	public static void drawBox(int height, int width)
	{
		for(int i= 0; i < height; i++)
		{
			drawBar(width);
		}
	}
	
	public static void drawBox(int height, int width, String mark)
	{
		for(int i= 0; i < height; i++)
		{
			drawBar(width, mark);
		}
		
	}
		
	public static void drawBar(int length) 
	{
		for(int i= 1; i < length; i++)
		{
			System.out.println("*");
		}
		System.out.println();
	}
	
	public static void drawBar(int length, String mark) 
	{
		for(int i= 1; i < length; i++)
		{
			System.out.println(mark);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) 
	{
		

	}

}
