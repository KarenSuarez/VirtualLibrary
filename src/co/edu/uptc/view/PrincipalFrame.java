package co.edu.uptc.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import co.edu.uptc.view.banner.BannerPanel;
import co.edu.uptc.view.body.BodyPanel;

public class PrincipalFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BannerPanel bannerPanel;
	private BodyPanel bodyPanel;

	public PrincipalFrame(ActionListener actionListener) {
		super("Gestión de libros");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.getContentPane().setLayout(new BorderLayout());
		this.initComponents(actionListener);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initComponents(ActionListener actionListener) {
		bannerPanel = new BannerPanel();
		this.add(bannerPanel, BorderLayout.NORTH);
		bodyPanel = new BodyPanel(actionListener);
		this.add(bodyPanel, BorderLayout.CENTER);

	}

	public void openCreationBookPanel() {
		bodyPanel.openCreationBookPanel();
	}

	public void openDeleteBookPanel() {
		bodyPanel.openDeleteBookPanel();
	}

	public void updateTableBooks() {
		bodyPanel.updateTableBooks();
	}
	
	public void searchBooks() {
		bodyPanel.searchBooks();
	}

	public int getDeleteActionCodeProduct() {
		return bodyPanel.getDeleteActionCodeProduct();
	}
	
}
