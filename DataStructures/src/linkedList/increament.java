package linkedList;

public class increament {

	public static void incrementuse(Node data) {
		Node temp = data;

		while (temp != null) {
			temp.data++;
			temp = temp.next;
		}
	}

}
