package Edureka;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo implements Comparator<Employee>
{






@Override
public int compare(Employee emp1, Employee emp2) {
	
	String name1=emp1.getName();
	String name2=emp2.getName();
	
		
	// TODO Auto-generated method stub
	return name2.compareTo(name1);
}
}