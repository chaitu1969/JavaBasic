package operators_ForLoops;

public class demo1 {
	
	public static void main(String[] args) {
		
		int a = 60;
		int b = 70;
		
		if(a++ > 60 && b > 70) {
			
			System.out.println("inside loop");
		} else {
			
			System.out.println("Outside Loop");
		}
		
		System.out.print(a+" "+b);
		System.out.println("");
		
	
	
	if(++a > 60 && ++b > 70) {
		
		System.out.println("inside loop");
	} else {
		
		System.out.println("Outside Loop");
	}
	
	System.out.print(a+" "+b);
	}

}
