package strings;

import java.util.Scanner;

public class subString {
	
	public static void sub(String str) {
		for(int i=0; i<str.length(); i++) {
			if(i<str.length()-1)
				System.out.print(str.charAt(i)+""+str.charAt(i+1)+" ");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String r = s.next();
		sub(r);
		
	}

}
