package strings;

import java.util.Scanner;

import maths.PrimitivesAndNonPrimitives.Main;

public class substring1 {
	public static void substr(String str) {
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String r = s.next();
		
		substr(r);
		
		
		}

}
