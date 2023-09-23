package co.edu.uptc.model;

public class Book {

	private String title;
	private int ISBNCode;
	private int volume;
	private String publisher;
	private Author author;
	private Side libraryHeadquarters;

	public Book(String title, int ISBNCode, int volume, String publisher, Author author, Side libraryHeadquarters) {
		this.title = title;
		this.ISBNCode = ISBNCode;
		this.volume = volume;
		this.publisher = publisher;
		this.author = author;
		this.libraryHeadquarters = libraryHeadquarters;
	}

	public String getTitle() {
		return title;
	}

	public int getISBNCode() {
		return ISBNCode;
	}

	public int getVolume() {
		return volume;
	}

	public String getPublisher() {
		return publisher;
	}

	public Author getAuthor() {
		return author;
	}

	public Side getLibraryHeadquarters() {
		return libraryHeadquarters;
	}

}
