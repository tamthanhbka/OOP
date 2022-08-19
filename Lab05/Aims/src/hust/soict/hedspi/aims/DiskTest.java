package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd0 = new DigitalVideoDisc();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setDirector("Foger Allers");
		dvd1.setLength(87);
		dvd1.setCost(19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Sciencr Fiction","George Licas",124,12.95f);


		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin","Animation","John Musker",90,18.95f);
		dvd0.printInfo();
		dvd1.printInfo();
		dvd2.printInfo();
		dvd3.printInfo();
		System.out.println(dvd1.search("  the   hary"));
	}

}
