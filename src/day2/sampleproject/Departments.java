package day2.sampleproject;

public class Departments {
	
	private String deptName;
	private double budget;
	private int counter=0;
	
	Employee[] emps=new Employee[5]; 
	public Departments(String name){
		this.deptName=name;
		this.budget=50000;
	}
	
	public void addEmployee(Employee obj){
		emps[counter]=obj;
		counter++;
		if(obj.getGrade()>5){
			this.budget+=150000;
		}else{
			this.budget+=100000;
		}
	}
	
	public void describe(){
		String temp="Dept Name: "+this.deptName
				+" \nBudget: "+this.budget
				+"   Employee: ";
		
		for(Employee x:emps){
			if(x !=null){
			temp+=x.getEmpInfo()+"  ";
			}
		}
		
		System.out.println(temp);
	}
	
	

}
