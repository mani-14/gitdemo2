package exprgrams;

import java.io.File;
import java.util.Arrays;

public class MissingNo {
	static  String name="agastya";
    public  void test()
    {
    	File f=new File(" ");
     System.out.println(name);
    }
	public static void main(String[] args) {
		try{// TODO Auto-generated method stub
     int [] numbers= {1,2,3,4,6,7,8,9};
     int N=9;
     int idealSum=(N*(N+1)) / 2;
     int tsum=Arrays.stream(numbers).sum();
    int missingNumber=idealSum-tsum;
    System.out.println(missingNumber);
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
   
         
	}

}
