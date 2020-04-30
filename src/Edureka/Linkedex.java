package Edureka;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List names=new LinkedList();
				names.add("january");
		        names.add("Febuary");
		        names.add("March");
		        names.add("april");
		        //names.remove(1);
		        names.add("may");
		      /*ListIterator itr=names.listIterator();
		     while(itr.hasNext())
		      {
		    	 // System.out.println(itr.next());
		      }
		     System.out.println("*************");
		     while(itr.hasPrevious())
		      {
		    	 
		    	 
		    	  
		    	  //System.out.println(itr.previous());
		      }*/
		      Collections.sort(names,String.CASE_INSENSITIVE_ORDER);
		      System.out.println(names);
		      
		      
		      
		      
			//System.out.println(names.get(1));
		//System.out.println(names.indexOf("april"));
	
		

	}

}
