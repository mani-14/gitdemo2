package testst;

import java.util.Scanner;

public class Stscan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your city name:");
   String name=sc.nextLine().toLowerCase().trim();
   if (name.equals("hyderabad"))
   {
   System.out.println("hello hyderabad");
   }
   
   else if (name.equals("chenni"))
   {
   System.out.println("hello tamil");
	}
   else if (name.equals("bangolore"))
   {
   System.out.println("hello bangolore");

     }
   else
	 
       {
	   System.out.println("enter valid city");
       }
}


		
	}


