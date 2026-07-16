package File_Handling_in_Java;

import java.io.File;
import java.io.IOException;

public class FileHAndling {

    public static void main(String[] args) {

        try {
            File myObj = new File("C:\\Files\\test.xlsx");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                System.out.println("Absolute path: " + myObj.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}