package hedspi.oolt.labs;

public class Order {
	// Khai bao mot hang so: so luong san pham toi da
	public static final int MAX_NUMBERS_ORDERED = 10;
	// Khai bao mot mang(Array) cac doi tuong DVD
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	// Khai bao thuoc tinh chua so luong san pham hien co cua don hang
	private int qtyOrdered = 0;

	// Xay dung cac phuong thuc get / set
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	// Xay dung phuong thuc them mot doi tuong DVD vao don hang
	// Noi dung: them mot doi tuong vao mang itemsOrdered
	// --> phai kiem tra xem mang da bi day chua?
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED)
			System.out.println("The order is almost full");
		else {
			this.itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
			System.out.println("Total disc: " + this.qtyOrdered);
		}
	}

	// Phuong thuc xoa mot doi tuong DVD khoi don hang
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		// Viet lenh loai bo doi tuong DVD khoi mang
		// Luu y kiem tra tinh huong mang rong(khong co phan tu nao)
		int check = 0;
		if (this.qtyOrdered == 0) {
			System.out.println("The order is empty!");
		} else {
			for (int i = 0; i < this.qtyOrdered; i++) {
				if (this.itemsOrdered[i] == disc) {
					for (int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j+1];
					}

					qtyOrdered--;
					System.out.println("The disc has been removed");
					System.out.println("Total disc: " + this.qtyOrdered);
					check = 1;
					break;
				}
			}
			if(check == 0)
				System.out.println("The disc is exist!");
		}
	}

	// Phuong thuc tinh tong gia tri cua don hang
	public float totalCost() {
		float total = 0.0f;
		for (int i = 0; i < this.qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

}
