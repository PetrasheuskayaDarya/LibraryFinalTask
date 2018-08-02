package by.htp.library.entity;

import java.util.Date;

public class Reports {

	private int id;
	private int bookId;
	private int readerId;
	private Date takeBookDate;
	private Date returnBookDate;
	
	public Reports() {
		
	}
	
	public Reports(int id, int bookId, int readerId, Date takeBookDate, Date returnBookDate) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.readerId = readerId;
		this.takeBookDate = takeBookDate;
		this.returnBookDate = returnBookDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public Date getTakeBookDate() {
		return takeBookDate;
	}

	public void setTakeBookDate(Date takeBookDate) {
		this.takeBookDate = takeBookDate;
	}

	public Date getReturnBookDate() {
		return returnBookDate;
	}

	public void setReturnBookDate(Date returnBookDate) {
		this.returnBookDate = returnBookDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + id;
		result = prime * result + readerId;
		result = prime * result + ((returnBookDate == null) ? 0 : returnBookDate.hashCode());
		result = prime * result + ((takeBookDate == null) ? 0 : takeBookDate.hashCode());
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
		Reports other = (Reports) obj;
		if (bookId != other.bookId)
			return false;
		if (id != other.id)
			return false;
		if (readerId != other.readerId)
			return false;
		if (returnBookDate == null) {
			if (other.returnBookDate != null)
				return false;
		} else if (!returnBookDate.equals(other.returnBookDate))
			return false;
		if (takeBookDate == null) {
			if (other.takeBookDate != null)
				return false;
		} else if (!takeBookDate.equals(other.takeBookDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reports [id=" + id + ", bookId=" + bookId + ", readerId=" + readerId + ", takeBookDate=" + takeBookDate
				+ ", returnBookDate=" + returnBookDate + "]";
	}
	
	
}
