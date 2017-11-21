package day1.example.stat;

public class Exp08Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a={0,1,2,3,4,5,6,7,8,9};
		//System.out.println(a[2] +" 	,  	"+a[4]); 

		//enhanced for loop
/*		for(int temp:a){
			System.out.println("a["+temp+"] = "+temp);
		}*/
		
/*		for(int i=0; i<10;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
*/
		
		 
		int[] x= new int[5];
		x[3]=35;
		x[0]=12;
		for(int temp2:x){
		System.out.println(temp2);
		}
		
		String[] st=new String[5];
		st[1]="one";
		st[3]="Three";
		for(String str1:st){
			System.out.println(str1);
		}
	
}
}
