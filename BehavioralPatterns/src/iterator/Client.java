package iterator;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Book> booksList = Arrays.asList(new Book(1, "Investor"), new Book(2, "Trader"), new Book(3, "Coding"),
				new Book(4, "DSA"));
		Library lib = new Library(booksList);
		Iterator itr = lib.createIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
}
