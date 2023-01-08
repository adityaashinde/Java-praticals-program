package package1;

class Student{
        int rollNumber;
        String name;
        }

public class TestObjectConstruction {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNumber = 7;
        s1.name = "Ganesh";

        System.out.println("Roll Number " + s1.rollNumber);
        System.out.println("Name is " + s1.name);

    }
}
