package recursion;

import java.util.*;
public class BinarySearch {
	
	public static int indexelement(int[] arr, int start, int end, int find) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(arr[mid] == find)
			return mid;
		if(arr[mid] > find) {
			return indexelement(arr, start, mid-1, find);
		}else
			return indexelement(arr, mid+1, end, find);
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[] arr = new int[n]; 
		
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		
		
		int find = s.nextInt();
		Arrays.sort(arr);
		
		System.out.println(indexelement(arr, 0, n-1, find));
	}

}
