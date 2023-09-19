package strings;

import java.util.Scanner;

public class substring2 {
	
	public static void substr(String str) {
		
		for(int len = 1; len<=str.length(); len++) {
			
			
			int end = len;
			
			for(int i=0; i<=str.length()-len; i++) {
				
				System.out.println(str.substring(i, end));
				
				end++;
			}
	
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String r = s.next();
		
		substr(r);
		
	}

}
