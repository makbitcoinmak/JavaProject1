package day1.example.stat;

public class Exp092Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] TwoDim=new int[4][3];
		int temp=10;
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				TwoDim[i][j]=temp;
				temp+=10;
						}
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				
				System.out.print(TwoDim[i][j]+"		");
		}
			System.out.println();
		}
	}
}
