package arrayList;

import java.util.*;


public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
	arr.add(11);
	arr.add(12);
	arr.add(13);
//	System.out.println(arr.size());
//	System.out.println(arr.get(2));
//	arr.set(2,15);
//	System.out.println(arr.get(2));
//	
//	System.out.println(arr.clone());
//	
//	System.out.println(arr.contains(13));
//	
	
	System.out.println(arr.size());
	System.out.println();
	
	ArrayList<String> arr2 = new ArrayList<>();	
	arr2.add("apple");
	arr2.add("banan");
	arr2.add("string");
	arr2.add("king");
//	arr2.remo
//	System.out.println(arr2.get(2));
	arr2.set(2, "fruit");
//	System.out.println(arr2.get(2));
//	System.out.println(arr2.get(3));
	
	
	System.out.println(arr2.size());
	System.out.println();
	System.out.println();
	for(String i : arr2) {
		System.out.println(i);
	}
	
	
//	System.out.println(arr.equals(arr2));
//
//	System.out.println(arr.hashCode());
//	System.out.println(arr2.hashCode());
	}

}
