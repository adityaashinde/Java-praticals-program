package package1;

class MyClass{
    MyClass(){
        System.out.println("In No arg Contr");
    }
    MyClass(int n){
        System.out.println("In One arg Contr");
    }
}

public class TestMyClass {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();

        MyClass m2 = new MyClass(11);
    }

}
