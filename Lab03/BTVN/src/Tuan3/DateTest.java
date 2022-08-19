package Tuan3;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate("30th","January",2022);
		MyDate date2 = new MyDate("Janury 11th 2021");
		MyDate date3 = new MyDate();
		MyDate date = new MyDate();
		
		date1.printInfo();
		date2.printInfo();
		date3.printInfo();
		date1.print();
		
		date.accept();
		date.printInfo();
	}

}
