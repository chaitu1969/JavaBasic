package strings;

import java.util.Scanner;

public class revword {
	
	public static String rev(String str) {
		
		String s = "";
		int start = 0;
		int end;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==' ' || i==str.length()) {
				
				int current = 0;
				String reverse = " ";
				
				for(int j=current; j<=i; j++) {
					reverse = str.charAt(j) + reverse;
				}		
				
				s += reverse+"" ;
				current = i+1;
			}
			
				
		}
		return s;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String r = s.nextLine();
		
		System.out.println(rev(r));
		
	}

}
