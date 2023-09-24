package co.edu.uptc.model;

public class ApplicationFunctions {
	
	private AVLTreeBook tree;
	
	public ApplicationFunctions() {
		tree = new AVLTreeBook();
	}

	public Book searchBookWithName(String title) {
		return tree.searchBookWithTitle(title);
	}

	public Book searchBookWithISBN(int ISBN) {
		Book assistantBook = new Book("null", ISBN, 0, "null", null, null, 0);
		return tree.searchBookWithISBN(assistantBook);
	}

	public void addNewBook(Book book) {
//		String title, int ISBNCode, int volume, String publisher, Author author, Side libraryHeadquarters, int copiesAvailable
//		book = new Book("nom");
		tree.addBook(book);
	}

	public void deleteBook(int ISBN) {
		Book assistantBook = new Book("null", ISBN, 0, "null", null, null, 0);
		tree.deleteBook(assistantBook);
	}

	public void listBooks() {
		tree.recorridoInordenArray();
		tree.clearArray();
	}

	public void sideSelected(int key) {
		switch (key) {
		case 1:
			
			break;
		case 2:

			break;
		case 3:

			break;
		}
	}

}
