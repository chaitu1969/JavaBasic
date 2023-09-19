package strings;

import java.util.Scanner;

public class pairs {
	
	public static void sunString(String str) {
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				System.out.print(str.charAt(i)+""+str.charAt(j)+" ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		sunString(str);
		
	}

}
