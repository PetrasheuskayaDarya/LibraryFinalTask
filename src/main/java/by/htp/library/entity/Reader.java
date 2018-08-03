package by.htp.library.entity;

import java.util.Date;

public class Reader {

	private int id;
	private String name;
	private String surname;
	private String password;
	private int readerNumber;
	private int phoneNumber;
	
	public Reader() {
		
	}
	
	public Reader(int id, String name, String surname, String password, int readerNumber, int phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.readerNumber = readerNumber;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getReaderNumber() {
		return readerNumber;
	}

	public void setReaderNumber(int readerNumber) {
		this.readerNumber = readerNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + readerNumber;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (readerNumber != other.readerNumber)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reader [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", readerNumber=" + readerNumber + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
