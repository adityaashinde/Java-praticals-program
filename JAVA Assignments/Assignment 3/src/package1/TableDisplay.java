package package1;

public class TableDisplay {
	public static void main(String[]args) {
int number=Integer.parseInt(args[0]);
System.out.println("Table of"+number +":");
for(int i=1;i<=10;i++) {
	System.out.println(number +"X" + i +"=" + (number*i));
}	
}
}
