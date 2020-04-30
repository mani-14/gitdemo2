package exprgrams;
class Shape
{
	void draw()
	{
		System.out.println("drawing...");
		
	}
}
class Rectangle extends Shape

{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
	
}
class Circle extends Shape

{
	void draw()
	{
		System.out.println("drawing circle");
	}
	
}

class Square extends Shape

{
	void draw()
	{
		System.out.println("drawing square");
	}
	
}

public class Polyex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle();
		s.draw();
		s=new Circle();
		s.draw();
		s=new Square();
		s.draw();
		
		

	}

}
