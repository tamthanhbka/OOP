package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import java.util.Random;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.media.Media;
public class Order {
	// Khai bao mot mang(Array) cac doi tuong DVD
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	// Khai bao thuoc tinh chua so luong san pham hien co cua don hang
	private int qtyOrdered = 0;
	//Khai bao thuoc tinh chua ngay order
	private MyDate dateOrdered;
	//Khai bao mot hang so: so luong order toi da
	public static final int MAX_LIMITTED_ORDERS = 10;
	//Khai bao thuoc tinh so luong order
	private static int nbOrders = 0;
	// Xay dung cac phuong thuc get / set
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public int getSize() {
		return this.itemsOrdered.size();
	}

	//Xay dung phuong thuc constructor
	public Order() {
		if(this.nbOrders < MAX_LIMITTED_ORDERS) {
		dateOrdered = new MyDate();
		this.nbOrders++;
		}else {
			System.out.println("The numbers order is almost full!");
		}
	}

	public void addMedia(Media media ) {
		if(!this.itemsOrdered.contains(media))
			this.itemsOrdered.add(media);
	}
	public void removeMedia(Media media) {
		if(this.itemsOrdered.contains(media))
			this.itemsOrdered.remove(media);
	}
	public void removeMedia(int id) {
        itemsOrdered.remove(id);
    }
	public void printOrder() {
		int i = 1;
		for(Media a : itemsOrdered) {
			System.out.print(i++ + ".");
			a.printInfo();
		}
	}
	// Phuong thuc tinh tong gia tri cua don hang
	
	public float totalCost() {
		//store the running total of the items in the order
		float total = 0;
		Media mediaItem;
		java.util.Iterator iter = this.itemsOrdered.iterator();
		while (iter.hasNext()) {
			mediaItem = (Media)(iter.next());
			total += mediaItem.getCost();
		}
		return total;
	}
	//Phuong thuc print cac item cua mot order
//	public void printOrder() {
//		Media media;
//		System.out.println("*************************************Order*******************************");
//		System.out.print("Date: ");
//		this.dateOrdered.printDate("yyyy-MM-dd");
//		System.out.println("Ordered Items:");
//		for(int i = 0; i < this.itemsOrdered.size(); i++) {
//			
//			media = this.itemsOrdered.get(i);
//			System.out.println((i+1) + ". DVD - " + media.getTitle() + " - " + media.getCategory() + " - " + media.getDirector() + " - " + media.getLength() + ": " + media.getCost() + "$" );
//		}
//		System.out.println("Total cost: " + this.totalCost() + "$");	
//		System.out.println("**************************************************************************");
//	}
//	//Xay dung phuong thuc chon mot san pham ngau nhien trong danh sach va mien phi cho san pham do
	public Media getALuckyItem() {
		Random rd = new Random();
		int luckynumber = rd.nextInt(this.itemsOrdered.size());
		this.itemsOrdered.get(luckynumber).setCost(0);
		return this.itemsOrdered.get(luckynumber);
	}
	

}
