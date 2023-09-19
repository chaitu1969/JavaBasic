package linkedList;

import java.util.*;

class DoubleNode {
	Node head;
	Node tail;
	
	DoubleNode(){
}
	DoubleNode(Node head,Node tail){
		this.head = head;
		this.tail = tail;
	}
}
public class addlinkedlist extends reverseLinkedlist {

	public static void print(Node n) {

		Node temp = n;

		while (temp != null) {

			System.out.print(temp.data + " ");

			temp = temp.next;
		}

	}

	public static Node addlist() {

		Scanner s = new Scanner(System.in);

		int data = s.nextInt();

		Node head = null;

		while (data != -1) {

			Node current = new Node(data);

			if (head == null) {

				head = current;
			} else {

				Node tail = head;

				while (tail.next != null) {

					tail = tail.next;
				}

				tail.next = current;

			}
			data = s.nextInt();
		}
		s.close();

		return head;

	}

	public static Node addvalue() {

		Scanner s = new Scanner(System.in);

		int data = s.nextInt();

		Node head = null;
		Node tail = null;

		while (data != -1) {

			Node current = new Node(data);

			if (head == null) {

				head = current;
				tail = current;
			} else {

				//				Node tail = head;
				//
				//				while (tail.next != null) {
				//					tail = tail.next;
				//				}

				tail.next = current;
				tail = tail.next;

			}

			data = s.nextInt();

		}

		s.close();

		return head;

	}

	public static Node addvalueatpostion(Node head, int pos, int data) {

		Node tobeadd = new Node(data);

		
		Node temp = head;

		if (pos == 0) {
//			Node tobeadd = new Node(data);
			tobeadd.next = temp;
//			head = tobeadd;
			
			return tobeadd;
		} else {

			int count = 0;

			Node previous = head;

			while (count < pos ) {
				count++;
				previous = previous.next;
			}

//			Node tobeadd = new Node(data);

			tobeadd.next = previous.next;

			previous.next = tobeadd;
		}

		return head;

	}

	public static Node deletenode(Node head, int pos) {
		Node temp = head;
		if(pos == 0) {
			head = head.next;
			return head;
		}else {
			int count = 0;
			while(count != pos && temp != null) {
				count++;
				temp = temp.next;
			}
			
			if(count == pos && temp.next != null) {
				temp.next = temp.next.next;
			}
						
			return head;
			
		}
	}
	
	public static void printR(Node head) {
		
		if(head == null)
			return;
		
		
		
		System.out.print(head.data+" ");
		
		
		printR(head.next);				
//		if we call function after print method it will print sequentially
//		if we call function before print method it will print reverse all values
	}
	
	public static Node Recusiveadd(Node head, int pos, int element) {
		
		if(head == null && pos > 0)
			return head;
		
		if(pos == 0) {
			Node tobeadd = new Node(element);
			tobeadd.next = head;
			return tobeadd;
		}else {
			head.next = Recusiveadd(head.next, pos-1, element);
			return head;
		}
		
	}
	
	public static DoubleNode reverseDouble(Node head) {
		
		DoubleNode ans;
		
		if(head == null || head.next == null) {
			ans = new DoubleNode(head,head);
			ans.head = head;
			ans.tail = head;
			
			return ans;
		}else
			return null;
			
		
			
	}

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
	
	public static Node middleLL(Node head) {
		Node first = head;
		Node second = head;
		
		
//		@ comment base case if LL has null value or single value
		
		
		
		if(head == null || head.next == null)			
			return head;
		
//		second case either for both even and odd number values in LL
		
		while(second.next != null && second.next.next != null) {
			first = first.next;
			second = second.next.next;
		}
		
		return first;
	}
	
	public static void main(String[] args) {

		Node summary = addvalue();
		Node summary2 = addvalue();
		
		summary = sorttwoLL(summary,summary2);
		
		print(summary);

//				print(temp);

//		Node summary = addvalueatpostion(temp,0,15);
		
//		summary = deletenode(summary,3);
		
//		replaceLinkedlist obj = new replaceLinkedlist();
//		
//		summary = obj.replaceLinkedlistmethod(summary, 2);
		
//		eleminateDublicates obj1 = new eleminateDublicates();
		
//		reverseLinkedlist obj1 = new reverseLinkedlist();
		
		
		
//		summary = reverseLinkedlist.printReverse(summary);
		
//		summary = Recusiveadd(summary,15,6);
//		
//		Node midans = middleLL(summary);
//		
//		System.out.println("middle node  is : "+midans.data);
//		
//		printR(summary);

//		print(summary);


	}

} 	
