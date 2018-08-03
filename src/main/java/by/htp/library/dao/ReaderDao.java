package by.htp.library.dao;


import java.util.List;

import by.htp.library.entity.Reader;

public interface ReaderDao {
	Reader readReaderById(int id);
	void add(Reader reader);
	void delete(Reader reader);
	void update(Reader readerCurrent, Reader readerNew);
	boolean authoriz(String login, String password);

}
