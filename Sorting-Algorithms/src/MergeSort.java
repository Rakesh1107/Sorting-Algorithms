
// Selection, Bubble & Insertion sort are O(n^2) in average case
// Merge Sort is O(n*log(n)) in worst case (all cases)
// Divide & Conquer, Recursive, Stable, Not In-place
// Time Complexity - O(n*log(n))
// Space complexity - O(n) & O(n*log(n)) if temp arrays are not garbage collected
// Randomized Quick sort is used to avoid worst case scenario O(n*log(n))

// MERGE SORT USING LEFT, RIGHT TEMP ARRAYS

public class MergeSort {
	
	static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i = 0; i < n1; i++)
			left[i] = arr[l+i];
		for(int i = 0; i < n2; i++)
			right[i] = arr[mid+1+i];
		int i = 0, j = 0, k = l;
		while(i < n1 && j < n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = left[i];
			i++; k++;
		}
		while(j < n2) {
			arr[k] = right[j];
			j++; k++;
		}
		
	}
	
	
	static void mergeSort(int[] arr, int l, int r) {
		if(l < r) { // base case - array has only one element
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	static void printArray(int[] arr) {
		for(int temp: arr) 
			System.out.print(temp + " ");
	}
	
	public static void main(String[] args) {	
		int[] arr = {7, 4, 9, 1, 3, -2, 10, 6, 11};
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Merge Sort using Left, Right arrays: ");
		printArray(arr);
	}
}
