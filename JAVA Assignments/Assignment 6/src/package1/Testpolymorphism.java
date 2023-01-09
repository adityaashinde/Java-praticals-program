package package1;

interface Eatable {
	void eat();
}

class Animal implements Eatable {
	public void eat() {
		System.out.println("Animal eats");
	}
	void run() {
		System.out.println("Animal runs");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dogs eats");
	}
	void run() {
		System.out.println("Dog runs");
	}
	void bark() {
		System.out.println("Dogs barks");
	}
}

public class Testpolymorphism {
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.eat();
		a1.run();
		System.out.println();
		
		Dog d1 = new Dog();
		d1.eat();
		d1.run();
		d1.bark();
		System.out.println();
		
		Animal a2 = new Animal();
		a2.eat();
		a2.run();
//		a2.bark();
		System.out.println();
		
//		Dog d2 = new Animal();
		
		Eatable e1 = new Animal();
		e1.eat();
//		e1.run();
		System.out.println();
		
		e1 = new Dog();
		e1.eat();
	}
}
