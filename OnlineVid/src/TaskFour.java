
public class TaskFour {
	public static void main(String args[])
	{
		int row=4;
		int i, j;
		//print stars for each solid rows
		for(i=1; i<=row; i++)
		{
			if(i== 1 || i== row)
			{
				for(j=1;j<=row;j++)
					System.out.print("*");
			}
			else //print stars for hollow rows
			{ 
				for(j=1;j<=row;j++)
					if(j==1 || j== row)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}
