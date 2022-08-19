package Tuan3;
import java.time.LocalDate;
import java.util.Scanner;
public class MyDate {
	//Khai bao cac thuoc tinh
	private String day;
	private String month;
	private int year;
	
	
	//Xay dung cac constructor
	public MyDate() {
		super();
		LocalDate date = LocalDate.now();
		String word = date.toString();
		String str[] = word.split("-");
		if(str[2].equals("01") == true) {
			str[2] = str[2].concat("st");
		}else if(str[2].equals("02")==true) {
			str[2] = str[2].concat("nd");
		}else if(str[2].equals("03")==true) {
			str[2] = str[2].concat("rd");
		}else {
			str[2] = str[2].concat("th");
		}
		setDay(str[2]);
		String arr[] = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		String arrMonth[] = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		for(int i = 0 ; i < 12 ; i++) {
			if(str[1].equals(arr[i])==true) {
				str[1] = arrMonth[i];
			}
		}
		setMonth(str[1]);
		setYear(Integer.parseInt(str[0]));		
	}
	public MyDate(String day, String month, int year) {
		super();
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public MyDate (String aDate) {
		super();
		String word[] = aDate.split("\\s");
		setDay(word[1]);
		setMonth(word[0]);
		setYear(Integer.parseInt(word[2]));
	}
	
	//Xay dung cac phuong thuc get/set
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		//Kiem tra ngay hop le
		String arrDay[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","20th","21th","22th","23th","24th","25th","26th","27th","28th","29th","30th","31th"};
		int check = 0;
		for(int i = 0; i < 31; i++) {
			if(day.equals(arrDay[i]) == true) {
				this.day = day;
				check = 1;
			}
		}
		if(check == 0) {
			this.day = null;
			//System.out.println("Nhap sai!");
		}
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		//Kiem tra thang hop le
		String arrMonth[] = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		int check = 0;
		for(int i = 0; i < 12 ; i++) {
			if(month.equals(arrMonth[i])) {
				this.month = month;
				check = 1;
			}
		}
		if(check == 0 ) {
			this.month = null;
			//System.out.println("Nhap sai!");
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>=0)
		{
			this.year = year;
		}else {
			this.year = 0;
		}
		
	}
		
	//Xay dung phuong thuc accept. Yeu cau nguoi dung nhap ngay vao tu ban phim
	public void accept() {
		Scanner in = new Scanner(System.in);
		String date;
		System.out.println("Hay nhap vao ngay thang nam:");
		date = in.nextLine();
		String word[] = date.split("\\s");
		setDay(word[1]);
		setMonth(word[0]);
		setYear(Integer.parseInt(word[2]));
		in.close();
	}
	//Xay dung phuong thuc print. In ngay ra man hinh
	public void print() {
		LocalDate date = LocalDate.now();
		String word = date.toString();
		String str[] = word.split("-");
		if(str[2].equals("01") == true) {
			str[2] = str[2].concat("st");
		}else if(str[2].equals("02")==true) {
			str[2] = str[2].concat("nd");
		}else if(str[2].equals("03")==true) {
			str[2] = str[2].concat("rd");
		}else {
			str[2] = str[2].concat("th");
		}
		String arr[] = {"01","02","03","04","05","06","07","08","09","10","11","12"};
		String arrMonth[] = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
		for(int i = 0 ; i < 12 ; i++) {
			if(str[1].equals(arr[i])==true) {
				str[1] = arrMonth[i];
			}
		}
		System.out.println("Current day...");
		System.out.println(str[1] +" " + str[2] + " " + str[0]);
	}
	//Phuong thuc in cac doi tuong
	public void printInfo() {
		System.out.println("Date info...");
		System.out.println(this.month +" " + this.day + " " + this.year);
	}
}
