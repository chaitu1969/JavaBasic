package strings;

import java.util.Scanner;

public class charecter {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String n = s.next();
		
		for(int i=0; i<n.length(); i++) {
			System.out.println(n.charAt(i));
		}
		
	}
	
}
