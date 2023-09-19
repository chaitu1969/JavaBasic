package pattern;

import java.util.*;

public class pattern7 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		for(int i=1 ; i<=n ; i++) {
			
			char c = (char)('A' + i - 1);
			
			for(int j=1 ; j<=n ; j++) {
				
				
				System.out.print(c);
				
				c = (char)(c+1);
			}
			
			System.out.println();
		}
				
	}

}
