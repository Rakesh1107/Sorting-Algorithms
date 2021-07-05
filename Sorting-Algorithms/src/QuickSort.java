
// Based on Divide & Conquer technique 
// Picks an element as pivot & partitions given array around the pivot
// There are different versions of quickSort depending on pivot: 
// 1. always 1st element as pivot
// 2. always last element as pivot
// 3. pick a random element as pivot
// 4. pick median as pivot 
// Partitioning - Backbone of Quick sort
//Time Complexity - O(n*log(n)) - average & O(n^2) - worst case
//Space complexity - O(1) (In-place unlike Merge sort)

// Quick sort with last element as pivot
public class QuickSort {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pi = start;
		for(int i = start; i <= end-1; i++) { // start -> end-1 (before pivot)
			if(arr[i] <= pivot) {
				swap(arr, pi, i);
				pi++;
			}
		}
		swap(arr, pi, end);
		return pi;
	}
	
	static void quickSort(int[] arr, int start, int end) {
		if(start < end) { // base case - array has only one element / invalid array
			int pi = partition(arr, start, end);
			quickSort(arr, start, pi-1);
			quickSort(arr, pi+1, end);
		}
	}
	
	static void printArray(int[] arr) {
		for(int temp: arr) 
			System.out.print(temp + " ");
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 4, 9, 1, 3, -2, 10, 6, 11};
		quickSort(arr, 0, arr.length-1);
		System.out.println("Quick sort with last element as pivot: ");
		printArray(arr);

	}

}
