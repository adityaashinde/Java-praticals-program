package package1;

public class ConstructorOverloading {
	int id;
	String name;
	public ConstructorOverloading() {
		System.out.println("Default constructor:\n");
	}
	public ConstructorOverloading(int a, String b) {
		id=a;
		name=b;
	}
	
	public static void main(String[] args) {
		ConstructorOverloading con1 = new ConstructorOverloading();
		System.out.println("Student Id : "+con1.id + "\n Student Name : "+con1.name);
		
		ConstructorOverloading con2 = new ConstructorOverloading(10, "Aditya");
		System.out.println("Student Id : "+con2.id + "\n Student Name : "+con2.name);
	}
}
