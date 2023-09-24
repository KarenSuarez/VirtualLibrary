package co.edu.uptc.model;

import java.util.ArrayList;

public class AVLTreeBook {

	private Node root;
	private String searchTitle;
	private Book assistantBook = null;

	private ArrayList<Book> arrayBooks;

	public AVLTreeBook() {
		arrayBooks = new ArrayList<Book>();
	}

	private int calculateBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return node.getBalanceFactor();
	}

	private int numberMax(int a, int b) {
		return (a > b) ? a : b;
	}

	private Node rigthRotation(Node y) {
		Node x = y.getLeftSon();
		Node temporalyoraly = x.getRightSon();

		x.setRightSon(y);
		y.setLeftSon(temporalyoraly);

		y.setBalanceFactor(
				numberMax(calculateBalanceFactor(y.getLeftSon()), calculateBalanceFactor(y.getRightSon())) + 1);
		x.setBalanceFactor(
				numberMax(calculateBalanceFactor(x.getLeftSon()), calculateBalanceFactor(x.getRightSon())) + 1);

		return x;
	}

	private Node leftRotation(Node x) {
		Node y = x.getRightSon();
		Node temporalyoraly = y.getLeftSon();

		y.setLeftSon(x);
		x.setRightSon(temporalyoraly);

		x.setBalanceFactor(
				numberMax(calculateBalanceFactor(x.getLeftSon()), calculateBalanceFactor(x.getRightSon())) + 1);
		y.setBalanceFactor(
				numberMax(calculateBalanceFactor(y.getLeftSon()), calculateBalanceFactor(y.getRightSon())) + 1);

		return y;
	}

	private int balanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return calculateBalanceFactor(node.getLeftSon()) - calculateBalanceFactor(node.getRightSon());
	}

	public Node addBook(Node node, Book book) {
		if (node == null) {
			return new Node(book);
		}

		if (book.getISBNCode() < node.getBook().getISBNCode()) {
			node.setLeftSon(addBook(node.getLeftSon(), book));
		} else if (book.getISBNCode() > node.getBook().getISBNCode()) {
			node.setRightSon(addBook(node.getRightSon(), book));
		} else {
			return node;
		}

		node.setBalanceFactor(
				1 + numberMax(calculateBalanceFactor(node.getLeftSon()), calculateBalanceFactor(node.getRightSon())));

		int balanceFactor = balanceFactor(node);

		if (balanceFactor > 1) {
			if (book.getISBNCode() < node.getLeftSon().getBook().getISBNCode()) {
				return rigthRotation(node);
			} else {
				node.setLeftSon(leftRotation(node.getLeftSon()));
				return rigthRotation(node);
			}
		}
		if (balanceFactor < -1) {
			if (book.getISBNCode() > node.getRightSon().getBook().getISBNCode()) {
				return leftRotation(node);
			} else {
				node.setRightSon(rigthRotation(node.getRightSon()));
				return leftRotation(node);
			}
		}

		return node;
	}

	public void addBook(Book book) {
		root = addBook(root, book);
	}

	public Book searchBookWithISBN(Book book) {
		return searchBookRec(root, book);
	}

	private Book searchBookRec(Node node, Book book) {
		if (node == null) {
			return null;
		}

		if (book.getISBNCode() == node.getBook().getISBNCode()) {
			return node.getBook();
		} else if (book.getISBNCode() < node.getBook().getISBNCode()) {
			return searchBookRec(node.getLeftSon(), book);
		} else {
			return searchBookRec(node.getRightSon(), book);
		}
	}

	public void deleteBook(Book book) {
		root = deleteBookRec(root, book);
	}

	private Node deleteBookRec(Node node, Book book) {
		if (node == null) {
			return node;
		}

		if (book.getISBNCode() < node.getBook().getISBNCode()) {
			node.setLeftSon(deleteBookRec(node.getLeftSon(), book));
		} else if (book.getISBNCode() > node.getBook().getISBNCode()) {
			node.setRightSon(deleteBookRec(node.getRightSon(), book));
		} else {
			if ((node.getLeftSon() == null) || (node.getRightSon() == null)) {
				Node temporaly = (node.getLeftSon() != null) ? node.getLeftSon() : node.getRightSon();
				if (temporaly == null) {
					temporaly = node;
					node = null;
				} else {
					node = temporaly;
				}
			} else {
				Node temporaly = findMin(node.getRightSon());
				node.setBook(temporaly.getBook());
				node.setRightSon(deleteBookRec(node.getRightSon(), temporaly.getBook()));
			}
		}

		if (node == null) {
			return node;
		}

		node.setBalanceFactor(
				numberMax(calculateBalanceFactor(node.getLeftSon()), calculateBalanceFactor(node.getRightSon())) + 1);

		int balanceFactor = calculateBalanceFactor(node);

		if (balanceFactor > 1) {
			if (book.getISBNCode() < node.getLeftSon().getBook().getISBNCode()) {
				return rigthRotation(node);
			} else {
				node.setLeftSon(leftRotation(node.getLeftSon()));
				return rigthRotation(node);
			}
		}

		if (balanceFactor < -1) {
			if (book.getISBNCode() > node.getRightSon().getBook().getISBNCode()) {
				return leftRotation(node);
			} else {
				node.setRightSon(rigthRotation(node.getRightSon()));
				return leftRotation(node);
			}
		}

		return node;
	}

	private Node findMin(Node node) {
		Node current = node;
		while (current.getLeftSon() != null) {
			current = current.getLeftSon();
		}
		return current;
	}

	public Book searchBookWithTitle(String titleBook) {
		searchTitle = titleBook;
		recorridoInorden();
		return assistantBook;
	}

	public Book recorridoInorden() {
		recorridoInordenRec(root);
		return assistantBook;
	}

	public ArrayList<Book> recorridoInordenArray() {
		recorridoInordenRecArray(root);
		return arrayBooks;
	}

	public void recorridoInordenRecArray(Node node) {
		if (node != null) {
			arrayBooks.add(node.getBook());
			recorridoInordenRecArray(node.getLeftSon());
			recorridoInordenRecArray(node.getRightSon());
		}
	}

	public void clearArray() {
		arrayBooks.clear();
	}

	public void recorridoInordenRec(Node nodo) {
		if (nodo != null) {
			if (nodo.getBook().getTitle().equals(searchTitle)) {
				assistantBook = nodo.getBook();
			}
			recorridoInordenRec(nodo.getLeftSon());
			recorridoInordenRec(nodo.getRightSon());
		}
	}
	
	public static void main(String[] args) {
		AVLTreeBook a = new AVLTreeBook();
		a.addBook(new Book("x",1,1,"x",new Author("x","x","x"),new Side("x",new Campus("x")),1));
		a.addBook(new Book("d",2,1,"d",new Author("d","d","d"),new Side("d",new Campus("d")),1));
		
		System.out.println("sasdzxc");
		
		Book b = new Book("d",2,1,"d",new Author("d","d","d"),new Side("d",new Campus("d")),1);
		System.out.println(a.searchBookWithISBN(b));
		System.out.println(a.searchBookWithTitle("d"));
		
		ArrayList <Book> xd = new ArrayList <Book>();
		xd = a.recorridoInordenArray();
		
		for (Book book : xd) {
			System.out.println(book);
		}
		

	}

}
