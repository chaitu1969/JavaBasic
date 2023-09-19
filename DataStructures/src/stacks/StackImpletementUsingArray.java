package stacks;

public class StackImpletementUsingArray {
	
	
	private int[] data;
	private int topIndex;
	
	public StackImpletementUsingArray(int size) {
		data = new int[size];
	}
	
	
	private void DoubleCapacity() {
		
		System.out.println("Double Capacity is called internally");
		int temp[] = data;
		
		data = new int[2 * temp.length];
		
		for(int i=0; i < temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
 	public StackImpletementUsingArray() {
		
		data = new int[5];
		topIndex = -1;
	}
	
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}else
			return false;
	}
	
	public int size() {
		
		return topIndex + 1;
		
	}
	
//	public void push(int element)throws StackFullException {
//		if(topIndex == data.length-1) {
//			throw new StackFullException();
//		}else {
//			data[topIndex+1] = element;
//			topIndex++;
//		}
//	}
	
	public void push(int element) {
		if(topIndex == data.length-1) {
			DoubleCapacity();
		}else {
			data[topIndex+1] = element;
			topIndex++;
		}
	}
	
	
	
	
	public int top()throws StackEmptyException {
		if(topIndex == -1) {
			throw new StackEmptyException();
		}else {
		return data[topIndex];
		}
	}
	
	public int pop()throws StackEmptyException {
		if(topIndex == -1) {
			 throw new StackEmptyException();
		}else {
			int temp = data[topIndex]; 
			topIndex--;
			return temp;
		}
	}

}
