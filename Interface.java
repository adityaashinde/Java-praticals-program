package package1;

interface Dog {
	public void dogSound();
	public void sleep();
}

class Cat implements Dog {
	public void dogSound() {
		System.out.println("The Cat says : meow meow");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}

public class Interface {
	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.dogSound();
		myCat.sleep();
	}
}
