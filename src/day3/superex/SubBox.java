package day3.superex;

public class SubBox extends Box{
	
	public void calculateVolume(int length, int width, int height){
	
		// double volume=calculateArea()*h; you can use direct method name
		double volume=super.calculateArea(length, width)* height;
		System.out.println("Volume = "+volume);
		
	}

}
