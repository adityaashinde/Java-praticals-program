package package1;

public class StringOperation2 {
	public static void main(String[] args) {
		
		String s1 = "Aditya";
		System.out.println(s1);
		
		System.out.println(s1.charAt(3));
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		
		System.out.println(s1.replace('a','u'));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,6));
		System.out.println(s1.equals("Aditya"));
		System.out.println(s1.equalsIgnoreCase("Aditya"));
	}
}
