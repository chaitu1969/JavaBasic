package stacks;

import java.util.Stack;

public class StackCollection {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int ele : arr) {
			stack.push(ele);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		System.out.println(stack.size());
//		System.out.println(stack.firstElement());
//		System.out.println(stack.lastElement());
//		System.out.println(stack.peek());
//		System.out.println(stack.isEmpty());
//		
	}

}
