package package2;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

        File myFile = new File("file.txt");

        try {
            myFile.createNewFile();
            System.out.println("Sucessfully create the file.");
        }
        catch (IOException e) {
            System.out.println("Unable to create this file.");
            e.printStackTrace();
        }
    }
}
