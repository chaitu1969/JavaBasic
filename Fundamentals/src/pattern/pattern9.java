package pattern;

import java.util.*;

public class pattern9 {
		
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			int count=1;
			
			for(int j=1; j<=n-i; j++) {
				
				System.out.print(" ");
			}
			
			for(int k=n-i+1; k<=n; k++) {
				
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
	
}
