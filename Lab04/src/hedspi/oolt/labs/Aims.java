package hedspi.oolt.labs;

public class Aims {

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
		
		//Tao mot don hang moi
		Order anOrder = new Order();
		//Them cac dia DVD vao don hang
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		//In ra tong gia tri don hang
//		System.out.printf("Total cost is: %.2f\n", anOrder.totalCost());
//		anOrder.removeDigitalVideoDisc(dvd2);
//		anOrder.removeDigitalVideoDisc(dvd2);
//		System.out.printf("Total cost is: %.2f\n", anOrder.totalCost());
		anOrder.printOrder();
	}

}




/*tu khoa final: khai bao hang
 * tu khoa static: khai bao cac thanh phan chung cho tat ca cac doi tuong cua class
 * Cac thanh phan static duowjc xac dinh khi bien dich chuong trinh
 *1 chuong trinh co 2 giai doan :
 *compile time va runtime
 *cac thanh phan static co the duojc goi truc tiep qua ten cua class ma ko can khoi tao doi tuong
 *Cac phuong thuc static chi goi den cac thuoc tinh hoac phuong thuc static khac trong lop
 *BTVN: nap chong phuong thuc main
 *
 **/
