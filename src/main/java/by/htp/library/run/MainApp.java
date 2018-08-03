package by.htp.library.run;

import java.util.List;

import by.htp.library.dao.BooksDao;
import by.htp.library.dao.imple.BooksDaoImpl;
import by.htp.library.dao.imple.ReaderDaoImpl;
import by.htp.library.entity.Books;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         ReaderDaoImpl reader = new ReaderDaoImpl();
         BooksDaoImpl book = new BooksDaoImpl();
         LibrarianDaoImpl = new LibrarianDaoImple()}

	public void showMainMenu() {

		System.out.println("Hello!");
		System.out.println("Welcome to the library");
		System.out.println("Click 1 if you reader");
		System.out.println("Click 2 if you Librarian");

		int menuItem = Scanner.nextInt();
		switch (menuItem) {

		case 1:
			reader.autorizeReader();
			reader.showReaderMenu();
			reader.showCatalogOfBooks();
			break;

		case 2:
			librarian.autorizeLibrarian();
			librarian.showLibrarianMenu();
			librarian.showOverdueBookReaders();
			break;

		case 3:
			System.out.println("Exit");
			break;
		default:
			System.out.println("Wrong number");
			System.out.println("Please try again");
			showMainMenu();
		}

	}

}

// BooksDao booksDao = new BooksDaoImpl();
// Books book = booksDao.readBookDetales(1);
// System.out.println(book);
// booksDao.allBooksDetales();
// booksDao.list1();
//
// System.out.println("-----------------");
//
// List<Books> books = booksDao.allBooksDetales();
// for (int i = 0; i < books.size(); i++) {
// System.out.println(books.get(i));
//
// System.out.println("-----------------");
//
// List<Books> books1 = booksDao.list1();
// for (int a = 0; a < books1.size(); a++) {
// System.out.println(books1.get(a));
// }
// }
// System.out.println("--------------------");
//
// Books addingABook = new Books();
// addingABook.setAuthor("Poul_Klausen");
// addingABook.setTitle("Programs_with_a_graphical_user_interface");
// booksDao.add(addingABook);
//
// System.out.println("-------------------------");
//
// Books delitingABook = new Books();
// delitingABook.setAuthor("Poul_Klausen");
// delitingABook.setTitle("Programs_with_a_graphical_user_interface");
// booksDao.delete(delitingABook);
//
// System.out.println("-------------------------");
//
// Books bookForUpdate = new Books();
// bookForUpdate.setAuthor("Poul_Klausen");
// bookForUpdate.setTitle("Programs_with_a_graphical_user_interface");
// bookForUpdate.setId(1);
// booksDao.update(bookForUpdate);
// }
//
// }
