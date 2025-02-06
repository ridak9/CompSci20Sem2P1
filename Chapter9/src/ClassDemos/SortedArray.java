package ClassDemos;

import java.util.Scanner;
import java.lang.Math;


 public class SortedArray {

	public static void main(String[] args) {
		int[] myNums;
		Scanner input = new Scanner(System.in);
		int numValues;
		int num;
		SelectionSort sortedArray;


		/* prompt user for the number of values to popluate array with */
		System.out.print("How many numbers for the array? ");
		numValues = input.nextInt();
		myNums = new int[numValues];

		/* populate array with random integers between 0 and 100 */
		for (int i = 0; i < numValues; i++) {
			num = (int)(101 * Math.random());
			myNums[i] = num;
		}

		/* display contents of original array */
		System.out.println("Original array contents:");
		for (int i = 0; i < numValues; i++) {
			System.out.println(myNums[i]);
		}

		/* display sorted contents */
		sortedArray = new SelectionSort(myNums);
		System.out.println("Sorted array contents:");
		sortedArray.display();
	}
}
