import java.util.Arrays;

public class CheckTheEqualityOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		boolean status=  Arrays.equals(a, b);
			if(status==true) {
				System.out.println("arrays are Equal");
			}	else {
				
				System.out.println("arrays are Not Equal");
			}
			

			
			//Approach 2
			int a1[]= {1,2,3,4,5};
			int b1[]= {1,2,3,4,5};
			
			boolean flag=true;
			
			if(a1.length ==b1.length) {
				
				for(int i=0;i<a1.length;i++) {
					if(a1[i]!=b1[i]) {
						flag=false;
					}
				}
			}
			else {
				flag=false;
			}if(flag==true) {
				System.out.println("Arrays are Equal");
			}else {
				System.out.println("Arrays are Not equal");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
