package package1;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
	
class FileHandling {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("gfgInput.txt");
			FileWriter fw = new FileWriter("gfgOutput.txt");
			String str="";
			int i;
			while((i=fr.read())!=-1); {
			str += (char)i;
		}
		System.out.println(str);
		fw.write(str);
		fr.close();
		fw.close();
		System.out.println("File Reading and Writing both Done");
		}
		catch(IOException e) {
			System.out.println("There are some IOException");
		}
	}	
}
