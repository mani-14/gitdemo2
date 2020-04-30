package exprgrams;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for( int i=1;i<=10;i++)
		{
			for(int j=1;j<=10-i;j++)
			{
				System.out.println(" ");
			}
			for( int k=1;k<=2*i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
			
	}

}
