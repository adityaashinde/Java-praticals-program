package package1;
import java.util.Scanner;

public class StringOperator4 {
	
		public static void main(String[] args) {
			String str;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Any Strings:");
			str = sc.nextLine();
			System.out.println("Entered Strings is:"+str);
			
			int count = 0;
			System.out.println("No. of Vovels: ");
			for (int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count++;
				}
			}
			System.out.println(count);
		}
}
