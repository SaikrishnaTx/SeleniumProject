
public class FindMaximumAndMinimumValuesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {5,10,20,30,40,60,120,50,890,2};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
  System.out.println("Maximum Number of Array "+max);
  
  for(int i=0;i<a.length;i++) {
	  if(a[i]<max) {
	  
	  max=a[i];
	  }
	  }
  System.out.println("Minimum Number of Aray "+max);
  }
	}


