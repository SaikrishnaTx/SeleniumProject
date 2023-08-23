
public class StringReverse {

	
	public static void main (String[] args) {
		
		
		String str="SAIKRISHNA";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		String string="SUNANDA";
		String reverse="";
		char a[]=string.toCharArray();
		
		int b=a.length;
		
		for(int i=b-1;i>=0;i--) {
		
		reverse=reverse+a[i];
		}
		System.out.println(reverse);
		
		String kri="SAI";
		StringBuffer strin= new StringBuffer(kri);
		
		System.out.println(strin.reverse());
		}
	
}
