
public class PalinDromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=1661;
		int rev=0;
		int arg=a;

		
		
		while(a!=0) {
			
			rev=rev*10+a%10;
		    a=a/10;
		  
		} 
		
        if(arg==rev) {
    	System.out.println("it is a palin Drome Number "+rev);
        }else {
    	System.out.println("it is not a palin Drome Number "+rev);
       }
	}

}
