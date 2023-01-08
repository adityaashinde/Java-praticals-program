package package1;

public class StringOperation {
	public static void main(String[] args) {
	String s1 = "Prasad";
	String s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		s2 = s2.concat("Sir");
		System.out.println(s1);
		System.out.println(s2);
		
		StringBuilder sb1 = new StringBuilder("N Infinity");
		StringBuilder sb2 = sb1;
		System.out.println();
		System.out.println(sb1);
		System.out.println(sb2);
		
		sb2.append("Pune");
		System.out.println(sb1);
		System.out.println(sb2);
    }
}
