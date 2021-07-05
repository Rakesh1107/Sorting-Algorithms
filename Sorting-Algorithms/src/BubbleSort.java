// Easiest and most inefficient algorithm
// More number of swaps
// Time Complexity - O(n) - Best, O(n^2) - Average & worst
// Space Complexity - O(1) & O(2) for optimized Bubble sort (with boolean variable)

public class BubbleSort {

	static void bubbleSort(int[] arr, int n) {
		boolean swapped;
		for (int i = 0; i < n-1; i++) {
			swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
	
	static void printArray(int[] arr) {
		for(int temp: arr) 
			System.out.print(temp + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 4, 9, 1, 3, -2, 10, 6, 11};
		bubbleSort(arr, arr.length);
		System.out.println("Bubble Sort:-");
		printArray(arr);
	}

}
