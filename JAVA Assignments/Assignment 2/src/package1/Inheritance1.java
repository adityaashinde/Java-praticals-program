package package1;

    class Base2{
        public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            System.out.println("I am in base and setting x now");
            this.x = x;
        }

        public void printMe(){
            System.out.println("I am a constructor");
        }
    }

    class Derived2 extends Base2{
        public int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

public class Inheritance1 {
        public static void main(String[] args) {
            // Creating an Object of base class
            Base2 b = new Base2();
            b.setX(4);
            System.out.println(b.getX());

            // Creating an object of derived class
            Derived2 d = new Derived2();
            d.setY(43);
            System.out.println(d.getY());
        }
    }

