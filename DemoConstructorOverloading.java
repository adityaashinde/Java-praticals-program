18. write a program in JAVA to demonstrate the constructor overloading

package constructoroverloading;

public class DemoConstructorOverloading{
	int id;
	String name;
	public ConstructorOverloading() {
		System.out.println("Default constructor");
		
	}
	public ConstructorOverloading(int a, String b) {
		id=a;
		name=b;
		
	}
	public static void main(String[]args) {
		ConstructorOverloading con=new ConstructorOverloading();
		System.out.println("Student Id: "+con.id + "\nStudent Name : "+con.name);
		ConstructorOverloading con2=new ConstructorOverloading(10, "Ram");
		System.out.println("Student Id: "+con2.id + "\nStudent Name : "+con2.name);
		}
}
