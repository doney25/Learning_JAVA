package javalab;

import java.util.Scanner;

public class StringDemo2 {
	public static void main(String args []) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String:");
		 String s = sc.nextLine();
		 System.out.println("Enter a String:");
		 String str = sc.nextLine();
		 int comp= s.compareTo(str);
		 if(comp==0)
		 {
			 System.out.println(s+" equal to "+str);
		 }
		 else if(comp>0)
		 {
			 System.out.println(s+ " is greater than "+str);
		 }
		 else
		 {
			 System.out.println(s+ " is less than "+str);
		 }
	}
}
