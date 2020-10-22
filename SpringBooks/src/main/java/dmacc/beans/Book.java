package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String genre;
	private int pageCount;
	@Autowired
	private Author author;
	
	public Book() {
		super();
		//  Auto-generated constructor stub
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, String genre, int pageCount, Author author) {
		super();
		this.title = title;
		this.genre = genre;
		this.pageCount = pageCount;
		this.author = author;
	}

	public Book(long id, String title, String genre, int pageCount, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.pageCount = pageCount;
		this.author = author;
	}



	public Book(String title, String genre, int pageCount) {
		super();
		this.title = title;
		this.genre = genre;
		this.pageCount = pageCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", genre=" + genre + ", pageCount=" + pageCount + ", author="
				+ author + "]";
	}
	
	
}
