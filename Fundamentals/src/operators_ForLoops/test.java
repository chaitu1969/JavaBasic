package operators_ForLoops;

public class test {
	
	public static void main(String[] args) {
		
//		for(int i=386; i>0; i=i%3) {
//			
//			System.out.println("*");
//		}
		
		
		
//		 int i=0;
//		    for(;;)
//		    {
//		        if(i==5)
//		            break;
//		        System.out.print(i);
//		        i++;
//		    }
//		
		
		
//		for(int i=7;i!=0;i--)
//	    {
//	        System.out.print(i--);
//	    }
		
		
//		
//		for(int i=1;;i++)
//	    {   
//			if(i<5)
//				System.out.print(i);
//			else
//				break;
//	    }

//	int i=1;
//	while(i<5) {
//		
//		if(i==3) {
//			break;
//		}
//		System.out.print(i+" " );
//		i++;
//	}
		
		int n=7;
		  if(n<=1)
	            System.out.println(n);
	        if(n>1) {
	            
	           for(int i=2; i<n; i++) {
	               
	               int flag=1;
	               
	               for(int j=2; j<=i/2; j++) {
	                   
	                   if(i%j==0){
	                       flag=flag+1;
	                   }
	               }
	               if(flag<2){
	                    System.out.println(i);
	               }             

	           }
		
	
	}
	

}
}
