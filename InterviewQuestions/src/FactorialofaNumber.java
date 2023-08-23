
public class FactorialofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=5;
		 long factorial=1;
		 
		 for(int i=1;i<=num;i++) {
			 factorial =factorial*i;
			 }
		 System.out.println("Factorial Number "+factorial);

		 
		 int number=10;
		 long facorialNumber=1;
		 for(int i=number;i>=1;i--) {
			 facorialNumber=facorialNumber*i;
		 }
		 System.out.println("Factorial Number "+facorialNumber);
	}

}
