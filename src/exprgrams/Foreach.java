package exprgrams;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("aariv");
	al.add("agastya");
	al.add("rohan");
	al.add("saketh");
	
	for(String s:al)
	{
		System.out.println(s);
	}
	
	}

}
