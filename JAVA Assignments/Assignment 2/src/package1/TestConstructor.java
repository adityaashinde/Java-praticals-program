package package1;

class Animal{
    Animal(){
        System.out.println("In No arg Animal");
    }
}
class Bird extends Animal{
    Bird(){
        System.out.println("In No arg Bird");
    }
}
class Sparrow extends Bird{
    Sparrow(){
        System.out.println("In NO arg Sparrow");
    }
    Sparrow(String name){
        System.out.println("In One arg Sparrow");
    }
}
public class TestConstructor {
    public static void main(String[] args) {
        Sparrow s1 = new Sparrow();
    }
}
