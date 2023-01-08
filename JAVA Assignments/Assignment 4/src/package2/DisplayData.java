package package2;

import java.io.File;

public class DisplayData {
    public static void main(String[] args) {

        File displayFile = new File("file.txt");

        if (displayFile.exists())
        {
            System.out.println("File Name : " + displayFile.getName());
            System.out.println("Absolute Path : " + displayFile.getAbsolutePath());
            System.out.println("Writeable : " + displayFile.canWrite());
            System.out.println("Readable : " + displayFile.canRead());
            System.out.println("Size of the File(in bytes) : " + displayFile.length());
        }
        else
        {
            System.out.println("The file does not Exits!!!");
        }
    }
}
