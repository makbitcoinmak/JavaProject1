package day2.oop.encapsulation;

public class Employee {

	
	// Encapsulation :  data & methods that act on the data
	// data hiding: is protecting data for accidental manipulations 
	// using getters & Setters methods
	private double salary;
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	void setSalary(double salary){
		if(salary>=40000 && salary<=200000){
			this.salary=salary;
		}
		else{
			this.salary=0;
			System.out.println("Check salary value out of range .....!");
		}
	}
	
	public double getSalary(){
		return salary;
	}
	void calculateTotalPay(){
		double totalpay=salary+bonus;
		System.out.println("Total Pay = "+totalpay);
	}
	
}
