package day3.abstractex;

public class TestContainer {

	public static void main(String[] args) {
	
		circleContainer c1=new circleContainer();
		c1.calculateVolume(10,5);
		
		squareContainer s1=new squareContainer();
		s1.calculateVolume(10, 5);

		// Another way of call super class obj
		System.out.println("-------------------------------------------------\n");
		Container c2=new circleContainer();
		c2.calculateVolume(10, 5);
		
		c2=new squareContainer();
		c2.calculateVolume(10, 5);
		
	}

}
