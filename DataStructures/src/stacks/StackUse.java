package stacks;

public class StackUse {
	
	public static void main(String[] args) throws StackFullException, StackEmptyException {
		
//		StackImpletementUsingArray stack = new StackImpletementUsingArray();
////		System.out.println(stack.pop());
//		stack.push(5);
//		stack.push(6);
//		stack.push(4);
//		stack.push(9);
//		stack.push(5);
//		stack.push(6);
//		stack.push(4);
//		stack.push(9);
//		stack.push(5);
//		stack.push(6);
//		stack.push(4);
//		stack.push(9);
		
//		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//		
//		for(int i=0; i<arr.length; i++) {
//			stack.push(arr[i]);
//		}
//		while(!stack.isEmpty()) {
//			System.out.print(stack.pop()+" ");
//		}
		
//		System.out.println(stack.size());
//		System.out.println(stack.top());
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.pop());
//		System.out.println(stack.top());
//		System.out.println(stack.size());
		
		StackUsingLL<Integer> stack = new StackUsingLL<Integer>();

		 int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		for(int i=0; i<arr.length; i++) {
			stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
//		stack.push(5);
//		stack.push(6);
//		stack.push(7);
//		stack.push(8);
//		System.out.println("size before pop : "+stack.size());
//		System.out.println(stack.pop());
//		System.out.println("size after pop : " + stack.size());
		
	}
}
