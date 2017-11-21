package day3.staticex;

public class TestStaticEx {

	public static void main(String[] args) {
		examStatic obj1=new examStatic();
	//	examStatic obj2=new examStatic(); 
		// only once staticblock is fired

		
		// Static data and methods are called directly using class names
		
		obj1.staticMethos();
		obj1.staticMethos();
		
		examStatic.staticMethos();
		
		obj1.nonStaticMethod();
		obj1.nonStaticMethod();
		
		
		System.out.println("---------*************----------");
		
		examStatic obj2=new examStatic();
		
		obj2.staticMethos();
		obj2.staticMethos();
		
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();
		
	
	}

}
