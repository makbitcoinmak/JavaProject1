package day3.abstractex;

public class circleContainer extends Container{

	public double calculateAreaOfBase(int l) {
		double area=Math.PI*(l/2)*(l/2);
		System.out.println("Circle Area = "+area);
		return area;
			
		
	}
	

}
