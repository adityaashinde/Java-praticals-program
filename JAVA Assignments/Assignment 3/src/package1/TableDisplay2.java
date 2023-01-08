package package1;

public class TableDisplay2 {
public static void main(String[]args){
	int startNum=Integer.parseInt(args[0]);
	int lastNum=Integer.parseInt(args[1]);
	for(int number=startNum; number<=lastNum;number++) {
		System.out.println("table of" + number);
		for (int i=1;i<=10;i++) {
			System.out.println(number + "X" + i +"="+ (number));
		}
	}
}
}
