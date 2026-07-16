package File_Handling_in_Java;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("C:\\Files\\test.xlsx");

			if (myObj.delete()) {
			    System.out.println("Delete File ");
			} else {
			    System.out.println("Failed to delete.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
