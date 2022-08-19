package hust.soict.hedspi.aims;
import java.util.*;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	public static Order order;
	public static void showMenu() {
		System.out.println("Order Management Application:");
		System.out.println("----------------------------------------------");
		System.out.println("1.Create new order");
		System.out.println("2.Add item to the order");
		System.out.println("3.Delete item by id");
		System.out.println("4.Display the item list of order");
		System.out.println("0.Eixt");
		System.out.println("----------------------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choose;
		Scanner scan = new Scanner(System.in);
		do{
		showMenu();
		choose = scan.nextInt();
		switch (choose) {
		case 0:
			System.out.println("Exit!");
			System.exit(0);
		case 1:
			order = new Order();
            System.out.println("New order created successfully!");
			break;
		case 2:
			if (order == null) {
                System.out.println("You need to create an order!");
            } else {
                System.out.println("Select item type:\n1.Book\n2.DigitalVideoDisc\n");
                int case1 = scan.nextInt();
                scan.nextLine();
                switch (case1) {
                    case 1: {
                        System.out.println("Enter title of book: ");
                        String title = scan.nextLine();
                        System.out.println("Enter category of book: ");
                        String category = scan.nextLine();
                        System.out.println("Enter authors of book: ");
                        List<String> authors = new ArrayList<>();
                        System.out.println("Enter number authors:");
                        int num = scan.nextInt();
                        scan.nextLine();
                        for(int i =0; i<num;i++) {
                        	System.out.println("Enter name of author" + (i+1) + ":");
                        	authors.add(scan.nextLine());
                        }
                        System.out.println("Enter cost of book:");
                        float cost = scan.nextFloat();                     
                        order.addMedia(new Book(title, category, cost, authors));
                        System.out.println("Add book successfully!");
                        break;
                    }
                    case 2: {
                        System.out.println("Enter title of DVD: ");
                        String title = scan.nextLine();
                        System.out.println("Enter category of DVD: ");
                        String category = scan.nextLine();
                        System.out.println("Enter director of DVD: ");
                        String director = scan.nextLine();
                        System.out.println("Enter length of DVD: ");
                        int length = scan.nextInt();
                        System.out.println("Enter cost of DVD: ");
                        float cost = scan.nextFloat();		
                        order.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
                        System.out.println("Add DVD successfully!");
                        break;
                    }
                    default: 
                        System.out.println("Error!");
                        break;
                }
            }
			break;
		case 3:
			if (order == null) {
                System.out.println("You need to create an order!");
            } else if(order.getSize()==0) {
            	System.out.println("You need to add item to the order!");
            }else {
                order.printOrder();
                System.out.println("Enter id: ");
                int id = scan.nextInt();
                order.removeMedia(id);
                System.out.println("Deleted successfully!");
            }
			break;
		case 4:
			if (order == null) {
                System.out.println("You need to create an order!");
            } else if(order.getSize()==0) {
            	System.out.println("You need to add item to the order!");
            }else {
                System.out.println("List of Order:");
                order.printOrder();
            }
			break;
		default:
			System.out.println("Error!");
            break;
		}
		}while(choose != 0);
		scan.close();

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
