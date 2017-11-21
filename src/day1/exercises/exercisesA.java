package day1.exercises;

public class exercisesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary=78678.65;
		double tax=0.0;
		
		if(salary<15000){
			tax=salary*0.10;
			System.out.println("Tax = "+tax);
		}else if(salary<=40000){
			tax=salary*.20;
			System.out.println("Tax = "+tax);
		}
		else{
			tax=salary*0.30;
			System.out.println("Tax = "+tax);
		}
		
		
		 
		 String[] num= {"10","20","30","40"};
		 int Total=0;
		 
		 for(String temp:num){
			  Total+=Integer.parseInt(temp);
			 }
	 	 System.out.println("Total ="+Total);
		 
		 
		
	 	 String str1="Hello World";
	 	 
	 	 System.out.println(str1.substring(6));
	 	 System.out.println(str1.toUpperCase());
		

	}

}
