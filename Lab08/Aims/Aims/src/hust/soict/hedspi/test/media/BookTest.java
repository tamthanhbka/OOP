package hust.soict.hedspi.test.media;

import hust.soict.hedspi.aims.media.*;

public class BookTest {

  public static void main(String[] args) {
    Book book = new Book("Ong lao danh ca va con ca vang", "Truyen co tich", 100, "Andersen");
    book.setContent(
    		"Once upon a time there were a fisherman and his wife who lived together in a filthy shack near the sea. Every day the fisherman went out fishing, and he fished, and he fished. Once he was sitting there fishing and looking into the clear water, and he sat, and he sat. Then his hook went to the bottom, deep down, and when he pulled it out, he had caught a large flounder.");
    System.out.println(book);
  }
}
