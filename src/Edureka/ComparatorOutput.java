package Edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorOutput {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
     Employee e=new Employee(1,"ravi",24);
     Employee e2=new Employee(2,"anil",26);
     Employee e3=new Employee(3,"arun",27);
     Employee e4=new Employee(4,"hari",28);
     List<Employee> emplist=new ArrayList<>();
     
     emplist.add(e);
     emplist.add(e2);
     emplist.add(e3);
     emplist.add(e4);
     Collections.sort(emplist,new ComparatorDemo()); 
     System.out.println(emplist);
             
      
     
     
     
	}

	


}
