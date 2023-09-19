package linkedList;

public class eleminateDublicates {
	
	public Node EleminateDublicates(Node head) {
		
		if(head.next == null) {
			return head;
		}
		
//		if(head == null) {
//			return head;
//		}
		
		Node temphead = head;
//		Node temp = head;
		Node tempnext = head.next;
		
		Node finalhead = head;
		
		while(tempnext != null) {
			
			if(temphead.data == tempnext.data) {
				
//				temphead = temphead.next;
				
				tempnext = tempnext.next;
				
			} else {
				temphead.next = tempnext;
				
				temphead = tempnext;
				
			}
		}
		temphead.next = null;
		
		return finalhead;
	}
		
		
	}

