package ClassDemos;

import java.util.Scanner;

public class CourseGrades 
{

	public static void main(String[] args) 
	{
		int[] courses; //Declare an Array
		//courses = new int[5]; //Initialization
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of courses: ");
		int c = input.nextInt();
		
		courses = new int[c];
		
		//For loop for storing course grades
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println("Enter grade for course: ");
			courses[i] = input.nextInt();
		}
		
		//For loop for dispalying course grades
		for(int i = 0; i < courses.length; i++)
		{
			System.out.println(courses[i] );
		}
		

	}

}
