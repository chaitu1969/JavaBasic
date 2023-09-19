package arrayList;

import java.util.*;

public class LlFirst {
	
	Node head;
	
	static class Node {
		
		int data;
		
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
		
	}
	
	
	public void printl() {
		
		Node n = head;
		
		while(n!= null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	}

	public static void main(String[] args) {
		
		LlFirst llist = new LlFirst();
		llist.head = new Node(1);
		
		Node second = new Node(1);
		
		Node third = new Node(2);
		
		llist.head.next = second;
		second.next = third;
		llist.printl();
		
	}
}
