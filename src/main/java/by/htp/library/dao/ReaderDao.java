package by.htp.library.dao;


import java.util.List;

import by.htp.library.entity.Reader;

public interface ReaderDao {
	Reader read(int id);
	List<Reader> list();
	void add(Reader reader);
	void delete(Reader reader);
	void update(Reader reader);

}
