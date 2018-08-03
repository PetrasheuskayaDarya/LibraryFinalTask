package by.htp.library.dao.imple;

import static by.htp.library.dao.util.MySqlPropertyManager.getLogin;
import static by.htp.library.dao.util.MySqlPropertyManager.getPass;
import static by.htp.library.dao.util.MySqlPropertyManager.getUrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import by.htp.library.dao.ReaderDao;
import by.htp.library.entity.Reader;

public class ReaderDaoImpl implements ReaderDao {
	
	private static final String SEE_INFORMATION_ANOUT_READER = "SELECT * FROM author WHERE id_author = ?";
	private static final String ADD_NEW_READER = "INSERT INTO reader(name, surname, password, reader_number, phone_number) VALUES (?, ?, ?, ?, ?)";
	private static final String UPDATE_READER = "UPDATE reader SET name = ?, surname= ?, password = ?, reader_number= ?, phone_number = ? WHERE name = ? AND surname= ? AND password = ? AND reader_number= ? AND phone_number = ?";
	private static final String DELETE_READER = "DELETE FROM reader WHERE name = ? AND surname = ? AND password = ? AND reader_number = ? AND phone_number = ?";
	private static final String SEE_THE_LIST_OF_ALL_READERS = "SELECT * FROM reader";

	@Override
	public Reader readReader(int id) {
		Reader reader = null;
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(SEE_INFORMATION_ANOUT_READER);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reader;
	}

	@Override
	public void add(Reader reader) {
		String name = reader.getName();
		String surname = reader.getSurname();
		String password = reader.getPassword();
		int reader_number = reader.getReaderNumber();
		int phone_number = reader.getPhoneNumber();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(ADD_NEW_READER);
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, password);
			ps.setInt(2, reader_number);
			ps.setInt(3, phone_number);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	@Override
	public void delete(Reader reader) {
		String name = reader.getName();
		String surname = reader.getSurname();
		String password = reader.getPassword();
		int reader_number = reader.getReaderNumber();
		int phone_number = reader.getPhoneNumber();
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(DELETE_READER);
			ps.setString(1, name);
			ps.setString(2, surname);
			ps.setString(3, password);
			ps.setInt(2, reader_number);
			ps.setInt(3, phone_number);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Reader readerCurrent, Reader readerNew) {
		String nameCurrent = readerCurrent.getName();
		String nameNew = readerNew.getName();
		String surnameCurrent = readerCurrent.getSurname();
		String surnameNew = readerNew.getSurname();
		String passwordCurrent = readerCurrent.getPassword();
		String passwordNew = readerNew.getPassword();
		int readerNumberCurrent =readerCurrent.getReaderNumber();
		int readerNumberNew = readerNew.getReaderNumber();
		int phoneNumberCurrent = readerCurrent.getPhoneNumber();
		int phoneNumberNew = readerNew.getPhoneNumber();	
		try (Connection conn = DriverManager.getConnection(getUrl(), getLogin(), getPass())) {
			PreparedStatement ps = conn.prepareStatement(UPDATE_READER);
			ps.setString(1, nameNew);
			ps.setString(2, surnameNew);
			ps.setString(4, nameCurrent);
			ps.setString(5, surnameCurrent);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean authoriz(String login, String password) {
		return false;
	}

}
