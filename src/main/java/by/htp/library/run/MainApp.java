package by.htp.library.run;

import java.util.List;

import by.htp.library.dao.BooksDao;
import by.htp.library.dao.imple.BooksDaoImpl;
import by.htp.library.entity.Books;

public class MainApp {

	public static void main(String[] args) {
		BooksDao booksDao = new BooksDaoImpl();
		Books book = booksDao.readBookDetales(1);
		System.out.println(book);
		booksDao.allBooksDetales();
		booksDao.list1();
		
System.out.println("-----------------");

		List<Books> books = booksDao.allBooksDetales();
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
			
System.out.println("-----------------");

			List<Books> books1 = booksDao.list1();
			for (int a = 0; a < books1.size(); a++) {
				System.out.println(books1.get(a));
			}
		}
	}
}
