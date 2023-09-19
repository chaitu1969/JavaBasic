package operators_ForLoops;

public class demo2 {
		public static void main(String[] args) {
			// int a=10; //int b=-20;
			
			//System.out.println(++a*8);
			
			int b=5;
			b+=5+(++b)+(b++);
			System.out.println(b);
		}
}
