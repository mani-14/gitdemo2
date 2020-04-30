package testst;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="newyork";
      StringBuffer sb=new StringBuffer(str);
      //System.out.println(sb.reverse());
      for(int i=str.length()-1;i>=0;i--)
      {
    	  System.out.print(str.charAt(i));
      }
      
	}

}
