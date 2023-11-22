package hello;

import java.util.StringTokenizer;

public class StringTokensDemo {
	public static void main(String args []) {
		StringTokenizer str = new StringTokenizer("2 10 33 50 60 77");
		System.out.println("number of tokens:"+str.countTokens());
		int evnCount=0,oddCount=0;
		while(str.hasMoreTokens()) {
			int num= Integer.parseInt(str.nextToken());	
			if(num%2==1)
			{
				oddCount++;
			}
			else
			{
				evnCount++;
			}
		}
		System.out.println(evnCount);
		System.out.println(oddCount);
	}
}
