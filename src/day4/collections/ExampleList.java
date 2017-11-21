package day4.collections;


import java.util.ArrayList;
import java.util.List;


public class ExampleList {

	public static void main(String[] args) {
	
		String arr[] = new String[10];
		
		arr[0]="zero";
		arr[9]="nine";
	//	arr[10]="onemore";

		// Disadv: Arrays are fixed length
	
		// Array List is dynamic objects 
		
/*		ArrayList list1=new ArrayList<>();
		
		list1.add("Zero");
		list1.add("more");
		list1.add(2);
		list1.add(true);
		// non generic list
		for(String temp:list1){
				System.out.println(temp);
	}

		for(Object temp:list1){
			System.out.println(temp);
			}
		System.out.println("------------------------------------");
	
		*/
		
		//generic list
		List<String> glist=new ArrayList<String>();
		glist.add("Zero");
		glist.add("one");
		glist.add("two");
		glist.add("four");
		
		for(String temp1:glist){
			System.out.println(temp1);
		}
		
		
		glist.remove(2);
	//	glist.remove("four");
	//	glist.add(0,"start");
		System.out.println("-------After remove -------------------------");
		
		for(String temp1:glist){
			System.out.println(temp1);
		}
		
		
		
}	
		
}
