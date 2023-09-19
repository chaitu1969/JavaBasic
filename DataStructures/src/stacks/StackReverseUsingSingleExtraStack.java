package stacks;

import java.util.Stack;

public class StackReverseUsingSingleExtraStack {
	
	
	public static void reverseStack(Stack<Integer> stack, Stack<Integer> extra) {
		if(stack.isEmpty()) {
			return;
		}
		
		
		// Using recursion each time top ele from stack is pop and placed at topele
		
		int topele = stack.pop();
		
		// using reverse funtion as recursion top ele has 5,4,3,2,1 in bottom to top order
		
		
		reverseStack(stack,extra);
		
		while(!stack.isEmpty()) {
			int ele = stack.pop();
			extra.push(ele);
		}
		
		stack.push(topele);
		
		while(!extra.isEmpty()) {
			int ele = extra.pop();
			stack.push(ele);
		}
		
	}
	
	public static void main(String[] args) {
	
		Stack<Integer> stack = new Stack<>();
		
		int arr[] = {1,2,3,4,5};
		
		for(int ele:arr) {
			stack.push(ele);
		}
		
		Stack<Integer> extra = new Stack<>();
		
		reverseStack(stack,extra);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
	
	
}
