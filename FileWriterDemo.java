package animals;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String args []) {
		String data = "HI , my name is Doney";
		FileWriter input = null;
		try
		{
			input = new FileWriter("input.txt");
			input.write(data); 
			input.flush();
			input.close();
		}
		catch(IOException io) {
			io.printStackTrace();
		}
	}

}
