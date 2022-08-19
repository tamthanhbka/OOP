package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Book extends Media {
	// Khai bao thuoc tinh
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency;
	//Phuong thuc get/set
	public List<String> getAuthors() {
		return authors;
	}
	 public void setContent(String content) {
		this.content = content;
		this.processContent();
	}

	public String getContent() {
		return this.content;
	}

	public List<String> getContentTokens() {
		return this.contentTokens;
	}

	public Map<String, Integer> getWordFrequency() {
		return this.wordFrequency;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
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
	public Book(String title, String category, float cost, String author) {
		super(title, category, cost);
	    this.authors.add(author);
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
	 @Override
	  public int compareTo( Media media) {
	    return super.compareTo(media);
	  }

	  private void processContent() {
	    String[] cuts = content.split("[\n, .]+");
	    this.contentTokens = Arrays.asList(cuts);
	    Collections.sort(this.contentTokens);
	    Iterator<String> stringIterator = this.contentTokens.iterator();
	    this.wordFrequency = new TreeMap<String, Integer>();
	    int val;
	    String key;
	    while (stringIterator.hasNext()) {
	      key = stringIterator.next();
	      val = 1;
	      if (this.wordFrequency.containsKey(key)) {
	        val = this.wordFrequency.get(key);
	        val++;
	      }
	      this.wordFrequency.put(key, val);
	    }
	  }

	  @Override
	  public String toString() {
	    StringBuilder format = new StringBuilder(
	        "Title: " + this.title + "\nCategory: " + this.category + "\nCost: "+this.cost+"\nAuthors: ");
	    Iterator<String> iter = authors.iterator();
	    while (iter.hasNext()) {
	      format.append(iter.next());
	      if (iter.hasNext()) {
	        format.append("-");
	      }
	    }
	    format.append("\nContent length: ");
	    format.append(this.contentTokens.size());
	    format.append("s\nToken list: ");
	    format.append(this.contentTokens);
	    format.append("\nWord frequency: ");
	    format.append(this.wordFrequency);
	    return format.toString();
	  }
}
