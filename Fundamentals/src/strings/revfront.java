package strings;

import java.util.Scanner;

public class revfront {
	
	public static String rev(String str) {
		
		String tmp1 = "";
		char c;
		
		for(int i=0; i<str.length(); i++) {
			
			  c = str.charAt(i);
			  
			  tmp1 = c+tmp1;
			
			
		}
		return tmp1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String r = s.next();
		
		System.out.println(rev(r));
		
		
	}

}
