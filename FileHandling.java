package animals;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileHandling {
		public static void main(String args []) {
			char [] data = new char[60];
			FileReader input = null;
			FileWriter output = null;
			try {
				input = new FileReader("input.txt");
				int bytes = input.read(data);
				//System.out.println(data);
				input.close();
				output = new FileWriter("output.txt");
				output.write(data,0,bytes);
				output.flush();
				output.close();				
			}
			catch(IOException io)
			{
				//System.out.println("ERORR!!!!");
				io.printStackTrace();
			}
		}
}
