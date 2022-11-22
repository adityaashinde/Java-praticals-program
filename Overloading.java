package package1;

public class Overloading {
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void add(double a, double b) {
		System.out.println(a+b);
    }	
	
	public static void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Overloading over = new Overloading();
		add(10,20);
		add(1.0,2.0);
		add(10,20,30);
	}

}
