

public class SelectionTwoDemo {
	//ternary operator
	//?: -> condition?exp1:exp2
	public static void main(String args[])
	{
		int i=8;
		
		int j;
		/*
		if(i>5)
		{
			j=2;
		}
		else {
			j=3;
		}
		*/
		j=i>5?8:2;
		System.out.println(j);
		
		//Switch example
	
		int n=2;
		
		
		switch(n)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
		default:
			System.out.println("No Match");
		
		}
	}

}
