package linkedList;

public class replaceLinkedlist extends eleminateDublicates{
	
	
	// Appending last n positions to the first and first remaining nodes to last 

	public Node replaceLinkedlistmethod(Node head, int pos) {
		
		if(pos == 0 || head.next == null) {
			return head;
		}
		
		Node tempTohead = head;
		Node ToaddLast = head;
		Node tailTobe = null;
		Node node = head;
		
		int count = 0;
		
		while(node.next != null) {
			
			ToaddLast = ToaddLast.next;
			count++;
			
			node = node.next;
		}
		
		int actualpos = count - pos;
		
		for(int i = 0;  i <= actualpos; i++) {
			
			tailTobe = tempTohead;
			
			tempTohead = tempTohead.next;
			
			
		}
		
		ToaddLast.next = head;

		head = tempTohead;
		
		tailTobe.next = null;

		return head;
	}

}
