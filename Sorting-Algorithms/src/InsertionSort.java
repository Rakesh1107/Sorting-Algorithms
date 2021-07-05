
public class InsertionSort {

	static void insertionSort(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
  
	static void printArray(int arr[]) {
		for (int temp: arr)
			System.out.print(temp + " ");
		System.out.println();
	}
  
	public static void main(String args[]) {		
		int arr[] = {7, 2, 9, 4, -2, 5, 10, 8, 1};
    	insertionSort(arr, arr.length);
		printArray(arr);
	}
} 
