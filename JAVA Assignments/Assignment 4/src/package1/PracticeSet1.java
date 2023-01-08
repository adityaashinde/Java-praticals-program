package package1;

import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
//  Que.1 = sum three numbers in Java
        int a = 3;
        int b = 5;
        int c = 8;
        int sum = a+b+c;
        System.out.println(sum);

//  Que.2 a program to calculate CGPA using marks of three subjects (out of 100)
        float sub1 = 34;
        float sub2 = 65;
        float sub3 = 46;
        float cgpa = (sub1 + sub2 + sub3)/30;
        System.out.println(cgpa);

//  Que.3 program that asks the user to enter his/her name and greets them
//  with “Hello <name>, have a good day” text.

        System.out.println("Whats your good name!?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+ name + " have a Good Night!!!");

//  Que.5 program to detect whether a number entered by the user is an integer or not
//        System.out.println("Enter your Number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());


    }
}
