package recursion;

import java.util.Scanner;

public class fact {
	
	public static long factor(int n) {
		if(n == 0) {
			return 1;
		}else
			return n * factor(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		long ans = factor(n);
		System.out.println(ans);
		
	}

}
