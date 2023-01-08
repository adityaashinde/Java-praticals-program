package package1;

interface Area {
	double PI_VALUE = 3.14;
	
	double computeArea(int...a);
	void displayArea(double area);
}
class Circle implements Area {

	@Override
	public double computeArea(int... a) {
		// TODO Auto-generated method stub
		double area;
		area = PI_VALUE * a[0] * a[0];
		return area;
	}

	@Override
	public void displayArea(double area) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle : "+area);
	}
	
}

class Rectangle implements Area {

	@Override
	public double computeArea(int... a) {
		// TODO Auto-generated method stub
		double area;
		area = a[0] * a[1];
		return area;
	}

	@Override
	public void displayArea(double area) {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle :"+area);	
	}
}

public class TestArea {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		double result = c1.computeArea(15);
		c1.displayArea(result);
		
		Rectangle r1 = new Rectangle();
		result = r1.computeArea(12,23);
		r1.displayArea(result);
	}
}
