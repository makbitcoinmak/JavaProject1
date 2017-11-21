package day3.abstractex;

public class squareContainer extends Container{

	public double calculateAreaOfBase(int l) {

		double area=l*l;
		System.out.println("Square Area = "+area);
		return area;
	}

}
