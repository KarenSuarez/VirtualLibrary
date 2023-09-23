package co.edu.uptc.view.body;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import co.edu.uptc.view.constants.TextConstants;

public class BodyPanel extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel centralPanel;
	private BookPanel bookPanel;

	public BodyPanel(ActionListener actionListener) {
		this.initComponents(actionListener);
	}

	public void initComponents(ActionListener actionListener) {
		this.setLayout(new BorderLayout());

		centralPanel = new JPanel(new CardLayout());
		bookPanel = new BookPanel(actionListener);
		centralPanel.add(bookPanel, TextConstants.BOOKS_PANEL_ID);

		this.add(centralPanel, BorderLayout.CENTER);

	}

	public void openCreationBookPanel() {
		bookPanel.openCreationBookPanel();
	}

	public void openDeleteBookPanel() {
		bookPanel.openDeleteBookPanel();
	}

	public void updateTableBooks() {
		bookPanel.updateTable();
	}

	public int getDeleteActionCodeProduct() {
		return bookPanel.getDeleteActionCode();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
