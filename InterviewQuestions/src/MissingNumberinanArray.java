
public class MissingNumberinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array should not have Duplicates
		//Array not Required Sorted order
		//Array Values sholud be in range
		
		int a[]= {1,2,3,4,5,7};
		
		
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			
			sum1=sum1+a[i];
			
		}
		System.out.println("Sum of Elements in Array "+ sum1);
		for(int i=1;i<=7;i++) {
			
			sum2=sum2+i;
		}
		System.out.println("Sum of range of Elements in Array "+sum2);
		
		System.out.println("missing Number is "+(sum2-sum1));
		
		
		
		
		
		
	}

}
