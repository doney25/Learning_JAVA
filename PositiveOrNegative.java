package w3resouce;

import java.util.Scanner;

public class PositiveOrNegative {

public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	
	int number;
	System.out.println("Enter the Integer:");
	number=sc.nextInt();
	if(number==0)
	{
		System.out.println("The number is zero");
	}
	else if(number>0)
	{
		System.out.println("The number is positive");
	}

	else
	{
		System.out.println("The number is negative");
	}
	
}
}