package day3.overriding;

public class NewBox extends Box{
	
	public void calculateVolume(int l, int w, int h){
		System.out.println("Volume = "+(l*w*h));
	}
	
	public void calculateArea(int l, int w){
		System.out.println("Sub Area = "+(l*w));
	}

}
