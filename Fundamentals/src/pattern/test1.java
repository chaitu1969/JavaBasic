package pattern;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=n; i>=1; i--) {
			
			int temp = 2*i-3;
			
			for(int k=temp; k>=1; k--) {
				
				System.out.print(k);
				
			}
			System.out.println();

					}
	}
}
