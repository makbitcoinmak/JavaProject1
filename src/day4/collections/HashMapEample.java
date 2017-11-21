package day4.collections;

import java.util.HashMap;

public class HashMapEample {

	public static void main(String[] args) {
	
		HashMap hm=new HashMap();
		// Non generic hm
		hm.put("alex", 93424.34);
		hm.put("linda", 934.34);
		hm.put("john", 93.34);
		hm.put("deon", 9.34);
		
		System.out.println(hm.get("linda"));
		
	// generic version of hashmap
		
		
		HashMap<String,String> hm1 = new HashMap<>();
		hm1.put("Test1", "Pass");
		hm1.put("Test2", "Pass");
		hm1.put("Test3", "Fail");
		hm1.put("Test4", "Pass");
		
		System.out.println(hm1.get("Test3"));
	}

}
