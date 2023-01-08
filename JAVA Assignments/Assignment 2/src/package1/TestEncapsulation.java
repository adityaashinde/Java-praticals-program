package package1;

class Student{
    private int rollnumber;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
    Student(){

    }
    Student(String name){
        this.name = name;
    }
    Student(int rollnumber,String name){
        this.rollnumber = rollnumber;
        this.name = name;
    }
}
public class TestEncapsulation {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollnumber(1);
        s1.setName("Sachin");

        System.out.println("ROLL   NAME");
        System.out.println("-----------");
        System.out.println(s1.getRollnumber() + "      " + s1.getName());

//        Student s2 = new Student(2);
//        s2.setName("Aditya");
//        System.out.println(s2.getRollnumber() + "      " + s2.getName());

        Student s3 = new Student("Shrav");
        s3.setRollnumber(3);
        System.out.println(s3.getRollnumber() + "      " + s3.getName());


        Student s4 = new Student(4,"Chaitu");
        System.out.println(s4.getRollnumber() + "      " + s4.getName());


    }

}
