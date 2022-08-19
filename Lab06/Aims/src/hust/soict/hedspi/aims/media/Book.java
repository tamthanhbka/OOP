package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
	// Khai bao thuoc tinh
	private List<String> authors = new ArrayList<String>();
	//Phuong thuc get/set
	public List<String> getAuthors() {
		return authors;
	}
	//phuong thuc constructor
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
		super(title, category);
	}
	public Book(String title, String category, List<String> authors) {
		super(title, category);
		this.authors = authors;
		
	}
	public Book(String title, String category, float cost, List<String> authors ) {
		super(title, category, cost);
		this.authors = authors;
	}
	public void addAuthor (String authorName) {
		//ensure that the author is not already
		//the ArrayList before adding
		if(!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor (String authorName) {
		//ensure that the author is present in the ArrayList before removing
		if((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}
	public void printInfo() {
		System.out.print("Book info: ");
		System.out.print( this.title);
		System.out.print(" - " + this.category);
		System.out.print(" - " );
		int i = 0;
		for(String a : authors) {
			if(i++ != 0) {
				System.out.print(", ");
			}
			System.out.print(a);
		}
		System.out.println(" - " + this.cost);	
	}
}
