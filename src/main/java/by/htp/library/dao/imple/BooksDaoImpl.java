package by.htp.library.dao.imple;


import static by.htp.library.dao.util.MySqlPropertyManager.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.htp.library.dao.BooksDao;
import by.htp.library.entity.Books;

public class BooksDaoImpl implements BooksDao {
	
	private static final String SELECT_BOOK_BYID = "SELECT * FROM books WHERE id = ?";
	private static final String SELECT_ALL_BOOKS_DETALES = "SELECT * FROM books";
	private static final String SELECT_CATALOG_OF_BOOK = "SELECT books.title FROM books";
	private static final String ADD_BOOK = "INSERT INTO books(title, author) VALUES (?, ?)";
	private static final String DELETE_BOOK = "DELETE FROM books WHERE title = ? AND author = ?";
	private static final String UPDATE_BOOK = "UPDATE books SET title = ?, author = ? WHERE id = ?";
	
	@Override
	public Books readBookDetales(int id) {
		Books book = null;
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(SELECT_BOOK_BYID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				book = buildBook(rs);
;			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}


	@Override
	public List<Books> allBooksDetales() {
		List<Books> listAllBooks = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(SELECT_ALL_BOOKS_DETALES);
			while (result.next()) {
				int id = result.getInt("id");
				String title = result.getString("title");
				String author = result.getString("author");
	
				Books b = new Books();
				b.setId(id);
				b.setTitle(title);
				b.setAuthor(author);
				listAllBooks.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listAllBooks;
	}
	
	@Override
	public List<Books> list1() {
		List<Books> catalogOfAllBooks = new ArrayList<>();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(SELECT_CATALOG_OF_BOOK);
			while (result.next()) {			
				String title = result.getString("title");
				Books b = new Books();
				b.setTitle(title);			
				catalogOfAllBooks.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return catalogOfAllBooks;
	}

	@Override
	public void add(Books book) {
		String title = book.getTitle();
		String author = book.getAuthor();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(ADD_BOOK);
			ps.setString(1, title);
			ps.setString(2, author);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(Books book) {
		String title = book.getTitle();
		String author = book.getAuthor();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(DELETE_BOOK);
			ps.setString(1, title);
			ps.setString(2, author);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Books book) {
		int id = book.getId();
		String title = book.getTitle();
		String author = book.getAuthor();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_BOOK);
			ps.setString(1, title);
			ps.setString(2, author);
			ps.setInt(3, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private Books buildBook(ResultSet rs) throws SQLException {
		Books book = new Books();
		book.setTitle(rs.getString("title"));
		return book;
	}






}
