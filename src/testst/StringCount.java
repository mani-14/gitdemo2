package testst;

import java.util.HashMap;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "this is my village";
		String[] myarray = input.split(" ");
		//System.out.println(myarray.length);
		
		
		String name="Ttthe united states of america";
		char ch[]=name.replaceAll("\\s", "").toCharArray();
		HashMap<Character,Integer> charcount=new HashMap<>();
		System.out.println(ch);
		System.out.println(ch[0]);
		for(int i=0;i<ch.length;i++)
		{
			if (charcount != null && charcount.containsKey(ch[i]))
			{
				charcount.put(ch[i], charcount.get(ch[i])+1);
			}
				
			else
			{
				charcount.put(ch[i], 1);
			}
				
				
				
		}
		
		System.out.println(charcount);	
	}

}
