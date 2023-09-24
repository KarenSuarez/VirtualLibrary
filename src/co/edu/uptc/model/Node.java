package co.edu.uptc.model;

public class Node {

	private int balanceFactor;
	private Book book;
	private Node leftSon, rightSon;

	public Node(Book book) {
		this.book = book;
		balanceFactor = 1;
		leftSon = null;
		rightSon = null;
	}

	public int getBalanceFactor() {
		return balanceFactor;
	}

	public void setBalanceFactor(int balanceFactor) {
		this.balanceFactor = balanceFactor;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Node getLeftSon() {
		return leftSon;
	}

	public void setLeftSon(Node leftSon) {
		this.leftSon = leftSon;
	}

	public Node getRightSon() {
		return rightSon;
	}

	public void setRightSon(Node rightSon) {
		this.rightSon = rightSon;
	}

}
