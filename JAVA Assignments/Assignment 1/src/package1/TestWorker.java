package package1;

class Worker{
    int number;
    String name;
}

public class TestWorker {
    public static void main(String[] args) {
        Worker w1 = new Worker();

        w1.number=7;
        w1.name="Rutuja";

        System.out.println(w1.number);
        System.out.println(w1.name);

        Worker w2 = new Worker();
        w2=w1;

        System.out.println(w2.number);
        System.out.println(w2.name);

    }
}
