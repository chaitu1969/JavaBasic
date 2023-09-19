package pattern;

import java.util.*;

public class pattern6 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		for(int i=1 ; i<=n ; i++) {
			
			char c = 'A';
			
			for(int j=1 ; j<=n ; j++) {
				
				//char ch = (char)('A' + j - 1);
				
				System.out.print(c);
				
				c = (char)(c + 1);
			}
			
			System.out.println();
		}
				
	}

}
