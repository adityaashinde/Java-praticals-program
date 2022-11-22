// 1. To find factorial of a number
package java_factorial;

class Factorial {
	public static void main(String args[]) {
		int i;
		int fact=1;
		int number=5;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of  "+number+" is: "+fact);
	}
	
}
