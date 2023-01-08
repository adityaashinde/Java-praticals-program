package package1;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
//        float a = sc.nextFloat();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
//        float b = sc.nextFloat();

        int sum = a+b;
//        float sum = a+b;
        System.out.println("The sum od=f these number is");
        System.out.println(sum);

//        boolean b1 = sc.hasNextInt();
//        boolean b1 = sc.hasNextFloat();
//        System.out.println(b1);
//        String str = sc.next();

//        String str = sc.next();
//        String str = sc.nextLine();
//        System.out.println(str);

    }
}
