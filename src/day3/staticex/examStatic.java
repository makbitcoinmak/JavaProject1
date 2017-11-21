package day3.staticex;

// one for class // Not one for object
public class examStatic {
	//static data
	static int staticVar;
	int nonstaticvar;
	
	//static method 
	static public void staticMethos(){
		System.out.println("Static Var = "+staticVar);
		staticVar++;
		
		//static methods can only access other static data & method
		
	}

	//Nonstatic method 
	public void nonStaticMethod(){
		System.out.println("NnstaticVar = "+nonstaticvar);
		nonstaticvar++;
		
	}
	
	static{
		System.out.println("Static Block ...............");
	}
	
	examStatic(){
		System.out.println("Constructor fired .................");
	}
	
}
