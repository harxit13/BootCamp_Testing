package File_Handling_in_Java;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileWriter myWriter = new FileWriter("C:\\Files\\test.txt");
	            myWriter.write("Hello, this is written using FileWriter.");
	            myWriter.close();
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing to the file.");
	            e.printStackTrace();
	        }
	}

}
