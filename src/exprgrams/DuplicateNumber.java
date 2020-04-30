package exprgrams;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,2,3,3,2,4,5,5,6};
		System.out.println("elements of given array:");
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				System.out.println(array[j]);
		 
			}
		}
		

	}

}
