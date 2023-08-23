
public class SumofElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,8};
		int b=a.length;
		
		int sum=0;
		
		for(int i=0;i<=b-1;i++) {
			sum=sum+a[i];
			
			
			
		}
		System.out.println(sum);
		
		//approach2
		
		int c[]= {1,2,3,4,5};
		int summ=0;
		
		
		for(int d:c) {
			summ=summ+d;
		}
		System.out.println(summ);
	}

}
