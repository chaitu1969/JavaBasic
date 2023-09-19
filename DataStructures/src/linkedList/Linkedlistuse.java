package linkedList;

import linkedList.increament;

public class Linkedlistuse {
	
	
	public static Node createLinkedlist() {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		
		return n1;
		
	}
	
	
	public static void print(Node n) {
		
		Node temp = n;
		
		// above temp is used because of not changing head (n) data.
		
		while(temp!= null) {
			
			System.out.print(temp.data+" ");
			
			temp=temp.next;
		}
		System.out.println();
		
		
		temp = n;
		
		// after looping all nodes assigned head to temp so that can use temp variable again.
	}
	
	
	public static void incrementuse(Node data) {
		
		Node temp = data;
		
		while(temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}
	
	
	// printing element at the given index
	
	public static void returnelement(Node head, int index) {
		
		int count = -1;
		
		int len = linklength(head);
		
		if(head == null || index >= len-1)
			return ;
		
		while(head != null) {
			
			count++;
			
			if(count == index) {
				System.out.println(head.data);
			}
			
			head = head.next;
			
		}
		
		
	}
	
	//**
	
	
	// counting the linked list length
	
	public static int linklength(Node head) {
		
		Node temp = head;
		
		int count = 0;
		
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	//**
	
	
	// Main method start from here
	
	public static void main(String[] args) {
		
		Node n = createLinkedlist();
		
		System.out.println("before increament");
		
		print(n);			// printing before increment
		
		incrementuse(n);
		
		System.out.println("after Increament");
		
		print(n);		// printing after increment
		
		
		System.out.print("element at particular index  : ");
		
		returnelement(n,2);
				
		
//		Node n2 = createLinkedlist();
//		print(n2);
		
		int len = linklength(n);
		
		
		System.out.println("total length of Linkedlist  :  "+ len);		// length of the Linkedlist 
		
		
		
	}

}
