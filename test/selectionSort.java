package test;

public class selectionSort {
	public static void selectionSort(int []arr) {
		for(int i = 0; i < arr.length; i++) {
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
				
			}
			int smallNum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNum;
		}
		
	}

	public static void main(String[] args) {
		int arr1[] = {2, 10, 15, 3, 34, 6, 20};
		
		System.out.println("Before selectionSort");
		for(int i : arr1) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		selectionSort(arr1);
		
		System.out.println("After sorting");
		for(int i : arr1) {
			System.out.print(i+" ");
			
		}
		
		

	}

}
