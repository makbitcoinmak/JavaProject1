package day4.collections.exceptions;

public class errorhandling {

	public static void main(String[] args) {

		
		int d[] = new int[3];
		
		int a=20;
		int b=0;
		int c=0;
		
/*		d[40]=100;
		c=a/b;
		System.out.println("c = "+c);*/
		
		// Run Time : java.lang.ArithmeticException: / by zero
	
	/*try{
		d[40]=100;
		c=a/b;
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Exception ="+e);
		e.printStackTrace();
	}catch(ArithmeticException e){
		System.out.println("Exception ="+e);
		e.printStackTrace();
	}catch(Exception e){
		System.out.println("Exception ="+e);
		e.printStackTrace();
	}
	*/
		
		
/*		try{
			d[40]=100;
			c=a/b;
		}catch(ArrayIndexOutOfBoundsException|ArithmeticException e){
			System.out.println("Exception ="+e);
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Exception ="+e);
			e.printStackTrace();
		}
		*/
		
		
		try{
			d[40]=100;
			c=a/b;
		}catch(ArrayIndexOutOfBoundsException|ArithmeticException e){
			System.out.println("Exception ="+e);
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Exception ="+e);
			e.printStackTrace();
		}finally{
			System.out.println("Will Always run ");
		}
		
	
	System.out.println("c = "+c);
	}
}
