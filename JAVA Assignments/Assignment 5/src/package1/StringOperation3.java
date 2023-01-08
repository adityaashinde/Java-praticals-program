package package1;
import java.util.Scanner;

public class StringOperation3 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		str = sc.next();
		System.out.println("Entered String is: "+str);
		checkPalindrome(str);
	}
	static void checkPalindrome(String str) {
		String rstr = "";
		char ch;
		int length=str.length();
		while(length>0) {
			ch=str.charAt(length-1);
			rstr = rstr + ch;
			length--;
		}
		System.out.println("Reverse String is:"+rstr);
		if (rstr.equals(rstr)) {
			System.out.println("Wow: Its Palindome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
