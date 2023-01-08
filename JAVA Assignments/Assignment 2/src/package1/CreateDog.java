package package1;

class Dog{
    static int dogCount;
    Dog(){
        dogCount++;
    }
}
public class CreateDog {
    public static void main(String[] args) {
        System.out.println("No of Dogs : " + Dog.dogCount);
        System.out.println();

        Dog d1 = new Dog();
        System.out.println("No of Dogs : " + d1.dogCount);
        System.out.println("No of Dogs : " + Dog.dogCount);
        System.out.println();

        Dog d2 = new Dog();
        System.out.println("No of Dogs : " + d2.dogCount);
        System.out.println("No of Dogs : " + d1.dogCount);
        System.out.println();
    }
}
