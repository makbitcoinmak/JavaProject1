package day2.oop.overloading;

public class Box {

	// Polymorphism
	// Overloading: When methods are of same name differentiated by their passing arguments
	// 
	void calculateArea(int length){
		System.out.println("1 param Area = "+(length*length));
	}
	void calculateArea(Double length){
		System.out.println("Double Area = "+(length*length));
	}
	void calculateArea(int length, int width){
		System.out.println("2 params Area = "+(length*width));
	}
}
