package day3.interfaceex01;

public class TestOffice {

	public static void main(String[] args) {
		
		Office obj=new Word();
		obj.Open();
		obj.Save();
		
		obj=new Excel();
		obj.Open();
		obj.Save();

	}

}
