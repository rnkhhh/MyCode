
public class OperatorDemo {
	
	
/*
 * Arithmetic +,-,*,%,/
 * Bitwise
 * Relational
 * Logical
 * 
 */
	public static void main(String args[])
	{
		int p=6, r=5;
		
		int r1=p+r;
		int r2=p-r;
		int r3=p*r;
		int r4=p/r; //gives the quotient value, by default it gives int value
		
		double d= (double)p/r; //it gives 1.2
		double q= (double)r4; //it gives 1.0
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(d);
		
	}
}
