package by.htp.library.dao;

import java.util.List;

import by.htp.library.entity.Books;

public interface BooksDao {

	Books readBookDetales(int id);
	List<Books> allBooksDetales();
	List<Books> list1();
	void add(Books book);
	void delete(Books book);
	void update(Books book);

}