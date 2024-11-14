package SkillBuilders;

public class Squares 
{

	public static void main(String[] args) 
	{
		int[] indexSquares = new int[5];
		
		//Store squares in the Array
		for(int i = 0; i < 5; i++)
		{
			indexSquares[i] = i * i;
		}
		
		//Display squares from the Array
		for(int i = 0; i < 5; i++)
		{
			System.out.println(indexSquares[i]);
		}
	}

}
