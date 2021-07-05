
// Selection, Bubble & Insertion sort are O(n^2) in average case
// Merge Sort is  O(n*log(n)) in worst case
// Divide & Conquer, Recursive, Stable, Not In-place
// Time Complexity - O(n*log(n))
// Space complexity - O(n) & O(n*log(n)) if temp arrays are not garbage collected

//MERGE SORT SINGLE TEMP ARRAY

public class MergeSort2 {
	
	static void merge(int[] arr, int l, int mid, int r) {
		int[] temp = new int[arr.length];
		int i = l, j = mid+1, k = l;
		while(i <= mid && j <= r) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i <= mid) {
			temp[k] = arr[i];
			i++; k++;
		}
		while(j <= r) {
			temp[k] = arr[j];
			j++; k++;
		}
		for(int x = l; x <= r; x++)
			arr[x] = temp[x];
		
	}
	
	
	static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
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
		System.out.println("Merge Sort using single temp array: ");
		printArray(arr);
	}
}
