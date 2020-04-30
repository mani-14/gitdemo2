package exprgrams;

class Overriding {
	public void run()
	{
		System.out.println("this is example of ");
	}
	
}
	
class Over1 extends Overriding
{

	public void main(String args[])
	{
		Over1 o=new Over1();
		o.run();
	}
}