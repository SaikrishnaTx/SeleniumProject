
public class CountNumberEvenandOddNumbers {
	
	public static void main(String[] args) {
		
		int numb=123456789;
		
		int evenCount =0;
		int oddCount=0;
		
		while(numb>0) {
		int res=numb%10;
		
		if(res%2==0) {
			evenCount++;
		}else {
			oddCount++;
		}
		numb=numb/10;
		}
		System.out.println("Number of Even Numbers "+evenCount);
		System.out.println("Number of Odd Numbers "+oddCount);
	}

}
