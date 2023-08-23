
public class Swappingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//logic 1	using third variable
		int a=10;
		int b=30;
		
		System.out.println("Before swapping the values in "+a+"  "+b );
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("Before swapping the values in "+a+"  "+b );
		
	//logic 2 without third variable use + and -
		int d=10;
		int e=30;
		
		System.out.println("Before swapping the values in "+d+"  "+e );
		
		d=d+e; //10+30 =40
		e=d-e; //40-30=10;
		d=d-e; ///40-10 =30
		System.out.println("Before swapping the values in "+d+"  "+e );
		
		//logic 3 without third variable use * and / the values not into zero
				int f=10;
				int g=30;
				
				System.out.println("Before swapping the values in "+f+"  "+g );
				
				f=f*g;
				g=f/g;
				f=f/g;
				
				System.out.println("Before swapping the values in "+f+"  "+g );
		//logic 4 bit wise XOR (^)operator
				
				//logic 2 without third variable use + and -
				int h=10;
				int i=30;
				
				System.out.println("Before swapping the values in "+h+"  "+i );
				
				 h=h^i;
				 i=i^h;
				 h=h^i;
				System.out.println("Before swapping the values in "+h+"  "+i );
				
				//USING SINGLE STATEMENT
				
				int j=10;
				int k=30;
				
				k=j+k -(j=k);
				System.out.println(j+" "+k);
	}

}
