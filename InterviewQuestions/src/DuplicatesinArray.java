
public class DuplicatesinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr[]= {"Sai","krishna","Mada","Sunanda","Sai"};
		
	
		
		//Approch 1
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicates in Array "+arr[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("No Duplicates Found");
		}
		
		
		
	}

}
