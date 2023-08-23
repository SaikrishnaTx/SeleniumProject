
public class PalinDromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="mam";
		
		String rev="";
		int len=str.length();
		String string=str;
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		if(string ==rev) {
			System.out.println("it is a palin drome "+rev);
		}else {
			System.out.println("it is a not a Palindrome "+rev);
		}

	}

}
