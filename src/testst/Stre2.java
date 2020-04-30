package testst;

import java.util.HashMap;

public class Stre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "you are awesome";
        char ch[]=s.replace("\\s", "").toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int i=0;i<ch.length;i++) 
        {
        	if(hm!=null&&hm.containsKey(ch[i]))
        	{
        		hm.put(ch[i], hm.get(ch[i])+1);
        		
        	}
        	else
        	{
        		hm.put(ch[i],1);
        	}
        }
		System.out.println(hm);
		
		
		
		
		/*char ch[] = s.replaceAll("\\s", "").toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (hm != null && hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i]) + 1);
			} else {
				hm.put(ch[i], 1);

			}
		}
  System.out.println(hm);*/
	}

}
