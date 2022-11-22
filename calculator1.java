package package1;
import java.util.Scanner;

public class calculator1 {
	public static void main(String[] args) {
		Double a,b,c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an operator: +, -, *, /");
		String operator = input.next();
		
		System.out.println("Enter First Value");
		a = input.nextDouble();
		
		System.out.println("Enter Second Value");
		b = input.nextDouble();
		
		switch (operator) {
		
		case "+":
			c = a + b;
			System.out.println(a+b);
			break;
		
		case "-":
			c = a - b;
			System.out.println(a-b);
			break;
			
		case "*":
			c = a * b;
			System.out.println(a*b);
			break;
			
		case "/":
			c = a / b;
			System.out.println(a/b);
			break;	
			
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}
}
