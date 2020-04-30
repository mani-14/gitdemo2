package testst;

import java.util.HashMap;
import java.util.Map;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
}
public class ImmuteSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Map<Integer,Book> map=new HashMap<>();
 Book b1=new Book(101,"let us C","yeshwanthkanethkar","BPB",8);
 Book b2=new Book(102,"data communications","forozen","mgrawhill",3);
 Book b3=new Book(103,"operating system","galvin","willey",6);
 map.put(1,b1);
 map.put(2,b2);
 map.put(3,b3);
 for(Map.Entry<Integer, Book> entry:map.entrySet()){    
     int key=entry.getKey();  
     Book b=entry.getValue();  
     System.out.println(key+" Details:");  
     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
 }    
 
	}

}
