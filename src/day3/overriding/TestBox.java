package day3.overriding;

public class TestBox {

	public static void main(String[] args) {
	/*	
		Box fedEx=new Box();
		
		fedEx.calculateArea(3,4);*/
		
		NewBox ups=new NewBox();
		
		ups.calculateArea(10, 20);
		ups.calculateVolume(3, 4,4);
	}

}
