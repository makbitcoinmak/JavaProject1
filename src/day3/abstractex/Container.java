package day3.abstractex;

public abstract class Container {
	
	
	public void calculateVolume(int l,int h){
		double volume=calculateAreaOfBase(l) * h;
		System.out.println("Volume = "+volume);
		
	}
	
	public abstract double calculateAreaOfBase(int l);

}
