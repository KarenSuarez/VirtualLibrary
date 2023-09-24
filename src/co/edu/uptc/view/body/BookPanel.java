package co.edu.uptc.view.body;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import co.edu.uptc.control.Commads;
import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.constants.TextConstants;
import co.edu.uptc.view.utilities.BasePanel;
import co.edu.uptc.view.utilities.CustomTableStyle;
import co.edu.uptc.view.utilities.RoundedButton;
import co.edu.uptc.view.utilities.RoundedJTextField;

public class BookPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTable booksTable;
	private JButton createButton;
	private JButton deleteButton;
	private CreationBookPanel creation;
	private DeleteBookPanel deleteBook;
	private JTextField searchField;
	private JButton searchButton;
	private Object[][] datos;

	public BookPanel(ActionListener actionListener) {
		this.setBackground(Color.WHITE);
		this.initComponents(actionListener);
		creation = new CreationBookPanel(actionListener);
		deleteBook = new DeleteBookPanel(actionListener);
	}

	public void initComponents(ActionListener actionListener) {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		createButton = new JButton();
		createButton.addActionListener(actionListener);
		createButton.setActionCommand(Commads.C_ADD_BOOK.toString());
		deleteButton = new JButton();
		deleteButton.addActionListener(actionListener);
		deleteButton.setActionCommand(Commads.C_DELETE_BOOK.toString());
		BasePanel panel = new BasePanel(TextConstants.BOOKS_TEXT, TextConstants.CREATE_BOOK_BUTTON_TEXT, createButton,
				TextConstants.DELETE_BOOK_BUTTON_TEXT, deleteButton);
		panel.setMaximumSize(new Dimension(1100, 180));
		panel.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));
		this.add(panel);

		searchField = new RoundedJTextField(400, 40);
		searchButton = new JButton();
		RoundedButton.makeRounded(searchButton, TextConstants.SEARCH_TEXT, 25, ColorConstants.YELLOW, Color.WHITE,
				Color.BLACK, FontConstants.PUCK_BOLD_BOLD_FONT_15, 170, 50);
		searchButton.addActionListener(actionListener);
		searchButton.setActionCommand(Commads.C_SEARCH_BOOK.toString());

		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(Color.WHITE);
		searchPanel.add(new JLabel(TextConstants.SEARCH_BOOK_TEXT)).setFont(FontConstants.PUCK_BOLD_BOLD_FONT_16);
		searchPanel.add(searchField);
		searchPanel.add(searchButton);

		this.add(searchPanel);

		String[] columnas = { TextConstants.BOOK_TEXT, TextConstants.AUTHOR_TEXT, TextConstants.ISBN_CODE_TEXT,
				TextConstants.VOLUME_TEXT, TextConstants.EDITORIAL_TEXT, TextConstants.SITE_TEXT };
		datos = new Object[][] { { "dfcsd", "dfcsd", "dfcsd", "dfcsd", "dfcsd", "dfcsd" },
				{ "2552", "2552", "2552", "2552", "2552", "2552" } };

		DefaultTableModel model = new DefaultTableModel(datos, columnas);

		booksTable = new JTable(model);
		CustomTableStyle.customizeTable(booksTable, ColorConstants.YELLOW, Color.WHITE, Color.BLACK, Color.BLACK,
				FontConstants.PUCK_BOLD_BOLD_FONT_18, FontConstants.PUCK_BOLD_PLAIN_FONT_14, 10, 40);

		JScrollPane scrollPane = new JScrollPane(booksTable);
		scrollPane.setMaximumSize(new Dimension(1100, 500));
		this.add(scrollPane);

	}

	public void openCreationBookPanel() {
		JFrame frame = new JFrame(TextConstants.CREATE_BOOK_BUTTON_TEXT);
		frame.setPreferredSize(new Dimension(900, 600));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(creation);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getWidth()) * 2;
		int y = (screenSize.height - getHeight());
		frame.setLocation(x, y);
		frame.pack();
		frame.setVisible(true);
	}

	public void openDeleteBookPanel() {
		JFrame frame = new JFrame(TextConstants.CREATE_BOOK_BUTTON_TEXT);
		frame.setPreferredSize(new Dimension(450, 265));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(deleteBook);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screenSize.width - getWidth()) * 5;
		int y = (screenSize.height - getHeight());
		frame.setLocation(x, y);
		frame.pack();
		frame.setVisible(true);
	}

	public void updateTable() {
//		DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
//		model.setRowCount(0);
//		for (ProductStock product : products) {
//			Object[] row = new Object[5];
//			row[0] = product.getName();
//			row[1] = product.getCode();
//			row[2] = product.getTax();
//			row[3] = product.getPriceSale();
//			row[4] = product.getQuantity();
//			model.addRow(row);
//		}
//		stockTable.repaint();
//		SwingUtilities.getWindowAncestor(creation).dispose();
	}

	public void searchBooks() {
		DefaultTableModel model = (DefaultTableModel) booksTable.getModel();
		String searchText = searchField.getText().trim().toLowerCase();
		model.setRowCount(0);

		for (Object[] row : datos) {
			boolean match = false;
			for (Object cellValue : row) {
				if (cellValue != null && cellValue.toString().toLowerCase().contains(searchText)) {
					match = true;
					break;
				}
			}
			if (match) {
				model.addRow(row);
			}
		}
	}

	public int getDeleteActionCode() {
		return deleteBook.getCode();
	}

}
