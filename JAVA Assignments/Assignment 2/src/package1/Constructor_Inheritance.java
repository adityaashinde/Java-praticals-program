/* Constructor Inheritance in Java :
When a derived class is extended from the base class, the constructor of the base class is
executed first followed by the constructor of the derived class. For the following Inheritance hierarchy ,
the constructors are executed in the order:
        C1- Parent
        C2 - Child
        C3 - Grandchild
        */
package package1;

class Base1 {
    Base1(){
        System.out.println("I am Constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded Constructor with value of x as: "+ x);
    }
}
class Derived1 extends Base1 {
    Derived1(){
        System.out.println("I am Derived Constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded Constructor of derived with value of y as: "+ y);
    }
}
class childDerived1 extends Derived1 {
    childDerived1(){
        System.out.println("I am Child Derived Constructor");
    }
    childDerived1(int x, int y, int z){
        super(x, y);
        System.out.println("I am an Child overloaded Constructor of derived with value of z as: "+ z);
    }
}
public class Constructor_Inheritance {
    public static void main(String[] args) {

//        Derived1 d1 = new Derived1();
//        Derived1 d2 = new Derived1(3,5);
//        childDerived1 ch1 = new childDerived1();
        childDerived1 ch2 = new childDerived1(23,34,45);
    }
}
