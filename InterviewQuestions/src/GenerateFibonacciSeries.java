
public class GenerateFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int n1=0; int n2=1; int sum=0;
		
		for (int i=2;i<10;i++) {
			  sum=n1+n2;
			  System.out.print(" "+sum);
			  n1=n2;
			  n2=sum;
		}
	}

}
