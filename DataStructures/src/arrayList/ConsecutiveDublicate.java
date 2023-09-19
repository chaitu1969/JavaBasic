package arrayList;

import java.util.*;

public class ConsecutiveDublicate {
	
	public static ArrayList<Integer> ConsecutiveDublicate(int arr[]){
	
	ArrayList<Integer> result = new ArrayList<>();
	
	result.add(arr[0]);
	
	for(int i=1; i < arr.length; i++) {
		
		if(arr[i] != arr[i-1]) {
			
			result.add(arr[i]);
			
		}
	}
	
	return result;
	}
	
	
	public static void main(String[] args) {
		
		
		int arr[] = {10,10,20,20,20,30,40,50,40,60,60,60,60,70};
		
		ArrayList<Integer> result = ConsecutiveDublicate(arr);
		
		for(int i = 0; i < result.size(); i++) {
			
			System.out.println(result.get(i));
			
		}
		
//		for(Integer i : result.size()) {
//			System.out.println(result.get(i));
//		}
		
		
	}
	

}
