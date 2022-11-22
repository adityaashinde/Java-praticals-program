package package1;

class MethodOverloading {
 
			static int add(int a, int b){return a+b;}  
			static double add(double a, double b){return a+b;}  
			}  
			class TestOverloading2{  
			public static void main(String[] args){  
			System.out.println(MethodOverloading.add(11,11));  
			System.out.println(MethodOverloading.add(12.3,12.6));  
			}} 

/*			overriding:-
			class Animal1 {
			   public void displayInfo() {
			      System.out.println("I am an animal.");
			   }
			}

			class Dog1 extends Animal1 {
			   @Override
			   public void displayInfo() {
			      System.out.println("I am a dog.");
			   }
			}

			class Main {
			   public static void main(String[] args) {
			      Dog1 d1 = new Dog1();
			      d1.displayInfo();
			   }
			}  

}

*/
