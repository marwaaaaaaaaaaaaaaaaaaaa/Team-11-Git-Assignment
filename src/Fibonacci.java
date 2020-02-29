
public class Fibonacci implements ISubscriber{ 
	
	static int N1=4,N2=8,N3=0;  
	 
	 public static void Fibonnacci(int input){    
	    if(input>0){    
	         N3 = N1 + N2;    
	         N1 = N2;    
	         N2 = N3;    
	         System.out.print(" "+N3);   
	        Fibonnacci(input-1);    
	     }    
	 }
	public  void notifySubscriber (int input) {
		 
			
			
		  System.out.print("\n" +"Hello,I am a Subscriber and fibonnaci  series  is  : "+N1+" "+N2);  
		 
		  Fibonnacci(input-2);
		  
			 }
		 
	 }
