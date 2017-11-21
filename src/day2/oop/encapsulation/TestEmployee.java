package day2.oop.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		//obj.salary=1000000;
		obj.setSalary(100000);
		obj.setBonus(2000);
		obj.calculateTotalPay();
		
		System.out.println("get salary = "+obj.getSalary());
		System.out.println("Get bonus = "+obj.getBonus());

	}

}
