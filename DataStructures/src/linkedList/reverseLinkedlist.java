package linkedList;

public class reverseLinkedlist {
	
//	public static void reverseLL(Node head) {
		
//		Node smalloutput = printReverse(head);
		
//	}
	
	public static Node printReverse(Node n) {
		
		if(n == null)
			return n;
		
		Node smalloutput = printReverse(n.next);
		System.out.print(n.data+" ");
		return smalloutput;
	}
}
		
//	}

//}
