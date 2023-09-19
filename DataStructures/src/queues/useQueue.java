package queues;

public class useQueue {

	public static void main(String[] args) throws queueException, queueFullException {
		// TODO Auto-generated method stub
		queueUsingArray q = new queueUsingArray(4);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
//		System.out.println(q.size());
//		System.out.println(q.front());
//		System.out.println(q.rear());
		for(int i=0; i<4; i++) {
			System.out.print(q.dequeue()+" ");
		}
//		q.dequeue();
//		System.out.println(q.rear());
	}

}
