package queues;

public class queueUsingArray {
	private int data[];
	private int size;
	private int front;
	private int rear;
	
	public queueUsingArray() {
		
		data = new int[5];
		front = -1;
		rear = -1;
	}
	
	public queueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}
	
	public void enqueue(int element){
//		if(!isEmpty() && front!=0) {
//			front=0;
//			rear=0;
//			data[front] = element;
//			size++;
//		}else {
//			rear++;
//			data[rear] = element;
//			size++;
//		}
		
		if(size == data.length) {
//			throw new queueFullException();
//			If the queue is full we need to double the array and insert the values in FIFO order
			DoubleQueue();
		}
		if(size == 0) {
			front = 0;
//			size++;
		}
		rear++;
		size++;
		data[rear] = element;
		
	}
	
	private void DoubleQueue() {
		// TODO Auto-generated method stub
//		The method is private because no one outside the class should access. Only the class inside is called when required
		int temp[] = data;
		data = new int[2 * temp.length];
		int index = 0;
		for(int i = front; i < temp.length; i++) {
			data[index++] = temp[i];
		}
//		Because of circular queue need to take two loops
		for(int i=0; i < front-1; i++) {
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length-1;
		
	}

	public int dequeue() throws queueException {
//		if(!isEmpty()) {
//			if(size()==1) {
//				front = -1;
//				return data[0];
//			}else {
//				int temp = data[rear];
//				rear--;
//				return temp;
//			}
//		}else {
//			return 0;
//		}
//		
//		if(!isEmpty()) {
//			if(front == rear) {
//				int temp = data[front];
//				front = -1;
//				rear = -1;
//				size--;
//				return temp;
//			}else if(front < rear){
//				int temp = data[front];
//				front++;
//				size--;
//				return temp;
//			}
//		}
//		return -1;
		if(size == 0) {
			throw new queueException();
		}
		int temp = data[front];
		front++;
		size--;
		
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}

	public int front() throws queueException {
		if(size < 0) {
			throw new queueException();
		}
		return data[front];
	}
	public int rear() throws queueException {
		if(size < 0) {
			throw new queueException();
		}
		return data[rear];
	}
}


