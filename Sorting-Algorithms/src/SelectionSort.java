
// Efficient than Bubble Sort
// Decreased no. of swaps than Bubble sort
// Never more than O(n) swaps
// Time Complexity - O(n^2) - all cases
// Space Complexity - O(1)
public class SelectionSort {

	static void selectionSort(int[] arr, int n) {
		for (int i = 0; i < n-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex]; // minimum value moved to arr[i] 
			arr[minIndex] = temp;
		}
	}
	
	static void printArray(int[] arr) {
		for(int temp: arr) 
			System.out.print(temp + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 4, 9, 1, 3, -2, 10, 6, 11};
		selectionSort(arr, arr.length);
		System.out.println("Selection Sort:-");
		printArray(arr);
	}

}
