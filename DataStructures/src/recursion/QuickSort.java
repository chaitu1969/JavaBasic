package recursion;

import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {

	
	public static int sorting(int[] arr, int start, int end) {
		
		//int pivot = arr[end];
		
		//int currentIndex = end;
		
		int presentIndex = start-1;
		
		for(int i=start; i < end; i++) {
			
			if(arr[i] <= arr[end]) {
				
				presentIndex++;
				
				int temp = arr[i];
				
				arr[i] = arr[presentIndex];
				
				arr[presentIndex] = temp;
				
			}
			
		}
		
		if(arr[presentIndex] > arr[end]) {
			
			int temp = arr[end];
			
			arr[end] = arr[presentIndex+1];
			
			arr[presentIndex+1] = temp;
		}
		
		return (presentIndex+1);
		
	}
	
	
	
	public static void quicsort(int[] arr,int start, int end) {
		
		if(start < end) {
			
		int pivotIndex = sorting(arr, start, end);
		
		quicsort(arr, start, pivotIndex - 1);
		quicsort(arr, pivotIndex + 1, end);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int size = s.nextInt();
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = s.nextInt();
		}
		
		quicsort(arr,0,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
