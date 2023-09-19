package strings;

import java.util.*;

public class reverse {
	
	public static String rev ( String str) {
		
		String s = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			s+=str.charAt(i);
			
		}
		return s;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String k = s.next();
		
		System.out.println(rev(k));
		
	}
}
