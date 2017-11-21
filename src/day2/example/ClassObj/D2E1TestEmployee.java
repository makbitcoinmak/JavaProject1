package day2.example.ClassObj;

public class D2E1TestEmployee {

	public static void main(String[] args) {
	
	/*	Employee alex,linda,John;
			alex=new Employee();
			linda=new Employee();
			John=new Employee();
*/
		
		D2E1Employee alex=new D2E1Employee();
		
		D2E1Employee linda=new D2E1Employee();
		
		D2E1Employee john=new D2E1Employee();
		
		
		System.out.println("*********** ALEX *********");
		alex.salary=90000;
		alex.bonus=20000;
		alex.calculateTotalPay();
		
		System.out.println("*********** LINDA *********");
		linda.salary=100.3070;
		linda.bonus=20000;
		linda.calculateTotalPay();
		
		System.out.println("*********** JOHN *********");
		john.salary=200.3060;
		john.bonus=20000;
		john.calculateTotalPay();
		
		
				// 0. Class usually contains data & methods
				// 0. Objects: Copy of class / instance of class
				// 0. template for objects
		
		
		
		
				// 1. passing argument
				// 2. passing arguments overwrites class level local data
				// 3. How to pass class level data instead of passing arguments (i.e This Keyword)
				
		
		
		
				// 4. Constructor: is a method that has same name as the class
				// 5. It is executed when object is created
				// 6. It is used to set default values
				// 7. Does not return anything including void
				
		
				// 8. Constructor with passing arguments
		
		
	}

}
