package abc;

import java.util.Scanner;

public class Circle {
private double area;
private double radius;
private String Colour;
 void accept()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter radius and Colour");
	 radius=sc.nextDouble();
	 Colour=sc.next();
 }
 double get_radius()
 {
	 return radius;
 }
 double find_area()
 {
	 final float Pi=3.14f;
	 area=Pi*radius*radius;
	 return area;
 }
 String get_Colour()
 {
	 return Colour;
 }
 
 
}
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      CircleInformation x= new CircleInformation();
	      CircleInformation y= new CircleInformation();
                  x.accept();
                  y.accept();
            double a,b;
            String p,q;
            a=x.find_area();
            b=y.find_area();
            p=x.get_Colour();
            q=y.get_Colour();
          if(a==b && p==(q))
          {
        	  System.out.println("Circles are Matching");
          }
          else
          {
        	  System.out.println("Circles are Not Matching");

          }
          
	}

	private static boolean p(String q) {
		// TODO Auto-generated method stub
		return false;
	}

}
