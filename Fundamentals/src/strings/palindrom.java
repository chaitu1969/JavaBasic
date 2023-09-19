package strings;

import java.lang.*;
import java.util.*;

public class palindrom {
	
	public static boolean palin(String str) {
		//int count=0;
		int i=0;
		int j=str.length()-1;
		if(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String r = s.next();
		System.out.println(palin(r));
				
	}

}
