package day2.example.ClassObj;

public class D2E6BoxPassArgOvrWritThis {
	
	int length;
	int width;
	// int length, width is passing arguments
	// passing arguments overwrite local class level data
	
		int calculateArea(int length, int width){
		int TotalArea=(this.length*this.width);
		System.out.println("Total Area = "+TotalArea);
		return TotalArea;
	}

}
