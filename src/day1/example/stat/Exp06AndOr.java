package day1.example.stat;

public class Exp06AndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=-10;
	/*
		if(x>10 && y>0){
			System.out.println("Both are +ve ");
		}else if(x>0 || y>0)
		{
			System.out.println("atleast one of number is +ve ");
		}else{
			System.out.println("Both numbers are =ve");
		}
		*/
		// & operator is bitwise check atleast one condition is true
		// && check first condition if ths is false not checks second
		if(x>10 & y>0){
			System.out.println("Both are +ve ");
		}else if(x>0 || y>0)
		{
			System.out.println("atleast one of number is +ve ");
		}else{
			System.out.println("Both numbers are =ve");
		}
	}

}
