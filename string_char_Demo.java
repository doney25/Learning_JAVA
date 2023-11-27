package javalab;

import java.util.Scanner;

public class string_char_Demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=sc.nextLine();
		System.out.print("Enter the position of Character:");
		int pos = sc.nextInt();
		System.out.println("Character at position "+pos+" is "+ s.charAt(pos));
	}

}
