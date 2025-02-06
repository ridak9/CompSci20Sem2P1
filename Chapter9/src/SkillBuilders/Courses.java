package SkillBuilders;

import java.util.Scanner;

public class Courses 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter teh number of courses: ");
		int c = input.nextInt();
		
		int[] courses = new int[c];
		
		//Store the course grades into the Array
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println("Enter the grade for course " +
								i + ":");
			courses[i] = input.nextInt();
		}
		
		//Display the grades
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println("course " + i + ":" + courses[i]);
		}
		

	}

}
