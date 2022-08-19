package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
// Khai bao cac thuoc tinh
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	//Xay dung cac phuong thuc
		// 1. Cac phuong thuc get/set
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length >= 0)
			this.length = length;
		else 
			this.length = 0;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		if(cost > 0)
			this.cost = cost;
		else
			this.cost = 0.0f;
	}
	
	//2.Cac phuong thuc khoi tao(constructor)
	//-Nhiem vu cua constructor: khoi tao vung bo nho(memory)
	//chua thong tin cua object va thiet lap/gan gia tri cho cac thuoc tinh cua object
	//Dac diem cua constructor:
	//+Ten cua constructor trung voi ten lop
	//+Khong co kieu tra ve, khong dung tu khoa void
	//+Co the xay dung nhieu constructor voi tham so khac nhau --> giup khoi tao doi tuong theo nhieu cach khac nhau
	
	
	//2.1 Constructor khong tham so
	public DigitalVideoDisc() {
		this.title = "";
		this.category = "";
		this.director = "";
		this.length = 0;
		this.cost = 0.0f;
	}

	
	//2.2 Constructor co 1 tham so : create DVD object title
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	//2.3 Constructor co 2 tham so:
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	
	//2.4 Constructor co 3 tham so:
	public DigitalVideoDisc(String title, String category, String director) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
	}
	
	//2.5 Constructor co 4 tham so:
	public DigitalVideoDisc(String title, String category, String director, int length) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
	}
	
	//2.6Constructor cos 5 tham so;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	
	//3. Cac  phuong thuc khac
	//Phuong thuc in thong tin cua doi tuong DVS
	public void printInfo() {
	System.out.println("DVD info...");
	System.out.println("Title: " + this.title);
	System.out.println("Category: " + this.category);
	System.out.println("Director: " + this.director);
	System.out.println("Length: " + this.length);
	System.out.println("Cost: " + this.cost);	
	}
	//Phuong thuc tim kiem theo title
	public boolean search(String title) {
		//Tach title cua tham so can tim thanh cac tu(word)
		//-> phuc vu cho viec xu ly tim kiem
		boolean check = false;
		String sTitle[] = title.split(" +");
		for (String a : sTitle) {
			if(this.title.toLowerCase().contains(a.toLowerCase())) {
				check = true;
			}
		}
		return check;
	}
	
	
}
