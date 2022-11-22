package package1;
import java.util.Scanner;

public class Rectangle {
	
		Double length = 0.0;
		Double width = 0.0;
		String colour = "";
		Double area = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		public Double getLength() {
			System.out.println("Enter the Length");
			length = scanner.nextDouble();
			return length;
		}
		public Double getWidth() {
			System.out.println("Enter the Width");
			width = scanner.nextDouble();
			return width;
		}
		public String getcolour() {
			System.out.println("Enter the Colour");
			colour = scanner.next();
			return colour;
		}
		public Double findArea() {
			area = length + width;
			System.out.println("-----------");
			System.out.println("Area is : " +area);
			System.out.println("-----------");
			System.out.println();

			return area;
		}
			
		public static void main(String[] args) {
			System.out.println("First Rectangle:");
			System.out.println();
			Rectangle rect1 = new Rectangle();
				
			rect1.getLength();
			rect1.getWidth();
			rect1.getcolour();
			rect1.findArea();
			
			System.out.println("Second Rectangle:");
			System.out.println();
			Rectangle rect2 = new Rectangle();
			
			rect2.getLength();
			rect2.getWidth();
			rect2.getcolour();
			rect2.findArea();
			
			if(rect1.area==rect2.area || rect1.colour.equals(rect2.colour))
				System.out.println("Matching");
				
				else
					System.out.println("Not Matching");				
	}

}
