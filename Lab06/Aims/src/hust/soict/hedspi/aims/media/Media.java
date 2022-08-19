package hust.soict.hedspi.aims.media;

public class Media {
	//Khai bao cac thuoc tinh
	protected String title;
	protected String category;
	protected float cost;
	//xay dung cac phuong thuc get/ set
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		if(cost > 0)
			this.cost = cost;
		else
			this.cost = 0.0f;
	}
	public Media() {
		this.title = "";
		this.category = "";
	}
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category) {
		this(title);
		this.category = category;
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public void printInfo() {
		
	}
	
}
