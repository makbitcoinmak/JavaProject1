package day1.example.stat;

public class Exp09StringManup {

	public static void main(String[] args) {
		
		String x="James Dean";
		System.out.println("Hello "+x);
		
		//toUpperCase
		System.out.println("To Lower Case  :"+x.toUpperCase());
		System.out.println("To Lower Case  : "+x.toLowerCase());
		System.out.println("SubString(3)   : "+x.substring(3));
		System.out.println("SubString(3,7) : "+x.substring(3, 7));
		System.out.println("charAt(2) 	   : "+x.charAt(2));
		
		String age="37";
		String salary="1244.45";
		
		int a=Integer.parseInt(age);
		System.out.println("age converted into Int /2 : "+a/2);
		
	
		Double s=Double.parseDouble(salary);
		System.out.println("Salary = "+s*1.23);
		
		
	}

}
