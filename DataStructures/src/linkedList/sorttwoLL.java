package linkedList;

public class sorttwoLL {
	
	public static Node sorttwoLL(Node head1, Node head2){
		
		Node firstll = head1;
		Node secondll = head2;
		
		Node mainhead;
		
		if(firstll.data < secondll.data) {
			mainhead = firstll;
		}
		else {
			mainhead = secondll;
		}
		
		Node tail = mainhead;
		
		if(head1 == null) {
			return head2;
		}
		else if(head2 == null) {
				return head1;
		}
		
		while(firstll.next != null || secondll.next != null) {
			if(firstll.data < secondll.data) {
				
				tail.next = secondll;
				
				firstll = firstll.next;
			
			}else {
				
				tail.next = firstll;
				
				secondll = secondll.next;

			}
		}
		
		
		return mainhead;
		
		
		
	}

}
