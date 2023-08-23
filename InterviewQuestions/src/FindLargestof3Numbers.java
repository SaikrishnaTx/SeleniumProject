
public class FindLargestof3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=50;
		int b=80;
		int c=124;
		
		//Appraoch1 one
		
		if(a>b && a>c) {
			System.out.println(a+" is Largest Number");
		}else if(b>a && b>c) {
			System.out.println(b+" is Largest Number");
		}else {
			System.out.println(c+" is Largest Number");
		}

	}

}
