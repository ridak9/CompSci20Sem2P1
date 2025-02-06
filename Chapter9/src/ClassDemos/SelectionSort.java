package ClassDemos;


 
 import java.util.Scanner;
 
 public class SelectionSort {
 	private int[] originalArray;
 	private int[] sortedArray;
 	
 	
 	/**
	 * post: A SelectionSort object of numItems has been created.
	 */
	public SelectionSort(int[] items) {
		
		originalArray = new int[items.length]; 
		for (int i = 0; i < items.length; i++) {
			originalArray[i] = items[i];
		}		
 		sortedArray = new int[items.length];
 	}
 	

	/** 
	 * Finds and returns the lowest value in originalArray and sets it to 1000
	 * post: The lowest values in originalArray has been returned
	 */
	private int findLowest() {
		int lowest = 1000;
		int lowestIndex = 0;
		
		for (int index = 0; index < originalArray.length; index++) {
			if (originalArray[index] < lowest) {
				lowestIndex = index;
				lowest = originalArray[index];
			}
		}
		originalArray[lowestIndex] = 1000;
		return(lowest);
	}


	/** 
	 * Places the sorted contents of originalArray into sortedArray.
	 * post: sortedArray contains the sorted contents of originalArray.
	 */
	private void sort() {
		for (int i = 0; i < originalArray.length; i++) {
			sortedArray[i] = findLowest();
		}
	}
	
	
	/** 
	 * Displays the contents of the sorted array.
	 * post: The sorted array contents have been displayed.
	 */
	public void display() {
		sort();
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}
 }