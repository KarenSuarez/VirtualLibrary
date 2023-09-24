package co.edu.uptc.model;

public class Book {

	private String title;
	private int ISBNCode;
	private int volume;
	private String publisher;
	private Author author;
	private Side libraryHeadquarters;
	private int copiesAvailable;

	public Book(String title, int ISBNCode, int volume, String publisher, Author author, Side libraryHeadquarters, int copiesAvailable) {
		this.title = title;
		this.ISBNCode = ISBNCode;
		this.volume = volume;
		this.publisher = publisher;
		this.author = author;
		this.libraryHeadquarters = libraryHeadquarters;
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getISBNCode() {
		return ISBNCode;
	}

	public void setISBNCode(int iSBNCode) {
		ISBNCode = iSBNCode;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Side getLibraryHeadquarters() {
		return libraryHeadquarters;
	}

	public void setLibraryHeadquarters(Side libraryHeadquarters) {
		this.libraryHeadquarters = libraryHeadquarters;
	}
	
	

	public int getCopiesAvailable() {
		return copiesAvailable;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", ISBNCode=" + ISBNCode + ", volume=" + volume + ", publisher=" + publisher
				+ ", author=" + author + ", libraryHeadquarters=" + libraryHeadquarters + ", copiesAvailable="
				+ copiesAvailable + "]";
	}

}
