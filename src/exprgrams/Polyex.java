package exprgrams;


class Bank{
	float getRateOfInterest()
	{
		
			return 0;
		
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}

	
}
class AXIS extends Bank
{
	float getRateOfInterest()
	{
		return 9.4f;
	}
}



public class Polyex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;
		b=new SBI();
		System.out.println("sbi rate of interest:"+b.getRateOfInterest());
		b=new AXIS();
		System.out.println("Axis"
				+ " rate of interest:"+b.getRateOfInterest());

	}

}
