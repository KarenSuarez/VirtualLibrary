package co.edu.uptc.model;

public class ApplicationFunctions {
	
	private AVLTreeBook tree;
	
	public ApplicationFunctions() {
		tree = new AVLTreeBook();
	}

	public void searchBookWithName(String title) {
		tree.searchBookWithTitle(title);
	}

	public Book searchBookWithISBN(int ISBN) {
		Book assistantBook = new Book("null", 4123, 0, "null", null, null, 0);
		return tree.searchBookWithISBN(assistantBook);
	}

	public void addNewBook(Book book) {

	}

	public void deleteBook(int ISBN) {

	}

	public void listBooks() {

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
