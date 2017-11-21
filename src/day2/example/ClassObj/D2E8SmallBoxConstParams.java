package day2.example.ClassObj;

public class D2E8SmallBoxConstParams {
	

	int length;
	int width;
	
	// Constructor: Is a method that has same name as the class
	// It s executed when an object is created
	// It is used to set default values
	// Constructor does not return anything including void
	
	D2E8SmallBoxConstParams(){
		this.length=5;
		this.width=6;
		System.out.println("Constructor Fired .................!");
		
	}
	D2E8SmallBoxConstParams(int length, int width){
		this.length=length;
		this.width=width;	
	}
	
		void calculateArea(){
		int TotalArea=(length*width);
		System.out.println("Total Area = "+TotalArea);
	}

}
