package package1;

class Variable{
    char c1;
    byte b1;
    short s1;
    int i1;
    long l1;
    float f1;
    double d1;
    boolean b2;

    String s2;
}
public class TestVariable {
    public static void main (String[] args){
        Variable v1 = new Variable();
        System.out.println(v1.c1);
        System.out.println(v1.b1);
        System.out.println(v1.s1);
        System.out.println(v1.i1);
        System.out.println(v1.l1);
        System.out.println(v1.f1);
        System.out.println(v1.d1);
        System.out.println(v1.b2);
        System.out.println(v1.s2);
    }

}


