package day2.sampleproject;

public class TestCompany {

	public static void main(String[] args) {
		
		Employee alex=new Employee("Alex Rod",6);
		Employee Linda=new Employee("Linda Berry",7);
		Employee John=new Employee("John Doe",3);
		
		Employee Sara=new Employee("Sara Time",7);
		Employee James=new Employee("James Doe",4);
		
		Departments sales=new Departments("XYZ Sales");
		Departments ITdept=new Departments("XYZ IT");
		
		sales.addEmployee(alex);
		sales.addEmployee(Linda);
		sales.addEmployee(John);
		
		ITdept.addEmployee(Sara);
		ITdept.addEmployee(James);
		
		sales.describe();
		
		ITdept.describe();
		
	}

}
