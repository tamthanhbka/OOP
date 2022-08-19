package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public String getArtist() {
		return artist;
	}
	public int getLength(ArrayList<Track> tracks) {
		int sumlength = 0;
		for(int i =0; i< tracks.size(); i++) {
			sumlength += tracks.get(i).getLength();
		}
		super.length = sumlength;
		return super.length;
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Already exist");
		}
		else {
			tracks.add(track);
		}
	}
	public void removeTrack(Track track) {
		tracks.remove(track);
	}
	 public CompactDisc(String title, String category, String director, float cost,
		      String artist, ArrayList<Track> tracks) {
		    super(title, category, director, cost);
		    this.artist = artist;
		    this.tracks = tracks;
		  }
	@Override
	public void play() {
		// TODO Auto-generated method stub
		//viet cac lenh hien thi thong tin cua CompactDisc
		
		for(int i = 0; i< tracks.size(); i++) {
			tracks.get(i).play();
			System.out.println("Playing artist: " + this.getArtist());
		}
	}
	
}
