package day2.oop.overloading;

public class TestBox {

	public static void main(String[] args) {
		
		Box obj=new Box();
		
		obj.calculateArea(4);
		
		obj.calculateArea(5.253543534545);
		
		obj.calculateArea(4, 3);

	}

}
