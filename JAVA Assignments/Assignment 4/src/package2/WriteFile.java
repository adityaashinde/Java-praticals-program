package package2;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

        // Code to write to a file

        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("File Handling in Java!!!\n Okay Byeeee!");
            fileWriter.close();
            System.out.println("Content is Sucessfully written to the file.");
        }
        catch (IOException e) {
            System.out.println("An unexpected error has occurred.");
            e.printStackTrace();
        }

    }
}
