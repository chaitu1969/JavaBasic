package recursion;

import java.util.Scanner;

public class unptonum {
	
	public static void  nnum(int n) {
		
		if(n <= 0)
			return ;
		else
		{
			nnum(n-1);
			System.out.print(n+" ");
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		//System.out.println(nnum(n));
		nnum(n);
		
	}

}
