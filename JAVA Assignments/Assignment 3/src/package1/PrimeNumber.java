package package1;

class PrimeNumber {
	public static void main(String[]args) {
		System.out.println("Prime Numbers are:");
		System.out.print("2");
		int number=3;
		boolean flag=true;
		int count=1;
		while(number<=100) {
			for(int i=2;i<number;i++) {
				if (number%i==0) {
					flag=false;
					break;
					
				}else {
					flag=true;
					continue;
				}
			}
			if (flag==true) {
			System.out.println(number +"");
			count++;
		}
			number++;
			
	}
		System.out.println("\n\nTotal Prime Numbers:"+ count);

}
}
