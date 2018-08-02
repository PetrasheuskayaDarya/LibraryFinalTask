package by.htp.library.dao;

import java.awt.print.Book;
import java.util.List;

public interface BooksDao {

	Book read(int id);
	List<Book> list();
	void add(Book book);
	void delete(Book book);
	void update(Book book);

}