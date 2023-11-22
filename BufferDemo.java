package hello;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("input .txt"));
		String input = in.readLine();
		StringTokenizer str = new StringTokenizer(input);
		int evenCount=0,oddCount=0;
		while(str.hasMoreElements()) {
			int num = Integer.parseInt(str.nextToken());
			if(num%2==1)
			{
			 oddCount++;	
			}
			else
			{
				evenCount++;
			}
			
		}
		System.out.println(oddCount);
		System.out.println(evenCount);
	}

}
