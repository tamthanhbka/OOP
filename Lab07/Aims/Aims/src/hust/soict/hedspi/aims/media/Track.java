package hust.soict.hedspi.aims.media;

public class Track implements Playable {
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track() {
		this.title = "";
		this.length = 0;
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Play Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
}
