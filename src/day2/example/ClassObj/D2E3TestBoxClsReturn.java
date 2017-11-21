package day2.example.ClassObj;

public class D2E3TestBoxClsReturn {

	public static void main(String[] args) {
		
		D2E3BoxClsReturn ups=new D2E3BoxClsReturn();
		D2E3BoxClsReturn fedEx=new D2E3BoxClsReturn();
		
		System.out.println("****************UPS BOX AREA ***************");
		ups.length=4;
		ups.width=10;
		int area1=ups.calculateArea();
		
		System.out.println("****************fedEx BOX AREA ***************");
		fedEx.length=10;
		fedEx.width=10;
		int area2=fedEx.calculateArea();
		
		System.out.println("********************************************");
		System.out.println("Total Area Area1 + Area2 : "+(area1+area2));
		
		
		// 0. Class usually contains data & methods
		// 0. Objects: Copy of class (or)  instance of class
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
