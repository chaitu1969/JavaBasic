package stacks;

public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;

	public StackUsingLL() {
		Node<T> head = null;
		size = 0;
	}
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	public void push(T ele) {
		
		Node<T> toadd = new Node<>(ele);
		
		if(head == null) {
			size++;
			head = toadd;
		}else {
			toadd.next = head;
			head = toadd;
			size++;
		}
	}
	
	public T pop() throws StackEmptyException{
		
		if(head == null) {
			throw new StackEmptyException();
		}
		Node<T> temp = head;
		
		head = head.next;
		
		size--;
		
		return temp.data;
		
	}
	
	public T top() throws StackEmptyException{
		if(head == null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	

}
