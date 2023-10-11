import java.util.Scanner;

public class greatestNumber {
		 public static void main(String [] args)
		 {
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter three Numbers:");
			 int firstNumber =sc.nextInt();
			 int secondNumber=sc.nextInt();
			 int thirdNumber =sc.nextInt();
			 if(firstNumber==secondNumber && secondNumber==thirdNumber)
			 {
				 System.out.println("The three numbers are equal");
			 }
			 else if(firstNumber>secondNumber && firstNumber>thirdNumber)
			 {
				 System.out.println(firstNumber+" is the greatest number");
			 }
			 else if(secondNumber>firstNumber && secondNumber>thirdNumber)
			 {
				 System.out.println(secondNumber+" is the greatest number");
			 }
			 else if(thirdNumber>firstNumber && thirdNumber>secondNumber)
			 {
				 System.out.println(thirdNumber+" is the greatest number");
			 }
		 }
	}
