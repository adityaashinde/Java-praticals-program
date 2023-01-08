package package1;

class Calculator {         // Super, Parent Class
    public int add (int i,int j) {
        return i + j;
    }
}
class CalcAdv extends Calculator{    // Sub,Child,Derived Class
    public int sub (int i, int j){
        return i-j;
    }
    public int multi (int i, int j){
        return i*j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

    CalcAdv c1 = new CalcAdv();
    int result1 = c1.add(6,9);
    int result2 = c1.sub(6,9);
    int result3 = c1.multi(6,9);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
