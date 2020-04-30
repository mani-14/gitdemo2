package Edureka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* 
 * this class belongs to arraylist functionalities
 * author=mani 
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 List<Object> contires=new ArrayList();
		
		 contires.add("usa");
		 contires.add("india");
		 contires.add("itlay");
		 contires.add("japan");
		 contires.add("china");
		 contires.add(123);
		 //System.out.println(contires);
		 contires.add(2, "spain");
		 contires.set(3, "germany");
		 //System.out.println(contires.get(3));
		 if (contires.contains("usa"))
		 {
			 System.out.println("avialble");
			 
			 
		 }
			System.out.println(contires);
		/* Iterator itr= contires.iterator();  
		 while(itr.hasNext()){  
			 if(itr.next() instanceof String)  
			 {
				 System.out.println(itr.next());
			 }
		// System.out.println(itr.next());  */
		 }  
		  
		 
		 
		 
	
	/* 
	 * This method retrives store details
	 * @return collection of store details
	 * @param location location information
	 * @param index indexinfo
	 */
	public String retriveStoreDetails(String Location,Integer index)
	{
		//perform business operations
		return null;
		
	}

}
