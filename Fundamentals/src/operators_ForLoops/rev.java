package operators_ForLoops;
import java.util.*;
public class rev {
	
	Scanner s = new Scanner(System.in);
	
	int n = s.nextInt();
	
	for(int i=1; i<=n; i++) {
		
		for(int j=1; j<=n; j++) {
			if(i>1 && j>n-i+1) {
				System.out.print("*");
			}
			System.out.print(j);
		}
		
	}
}
}
