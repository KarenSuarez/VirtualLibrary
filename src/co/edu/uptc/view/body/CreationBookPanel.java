package co.edu.uptc.view.body;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import co.edu.uptc.control.Commads;
import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.constants.TextConstants;
import co.edu.uptc.view.utilities.RoundedButton;
import co.edu.uptc.view.utilities.RoundedJTextField;

public class CreationBookPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField title;
	private JTextField ISBNCode;
	private JTextField volume;
	private JTextField editorial;
	private JTextField nameAuthor;
	private JTextField lastNameAuthor;
	private JTextField biographyAuthor;
	private JButton save;

	public CreationBookPanel(ActionListener actionListener) {
		this.setBackground(Color.LIGHT_GRAY);
		this.initComponents(actionListener);
	}

	public void initComponents(ActionListener actionListener) {
		title = new RoundedJTextField();
		ISBNCode = new RoundedJTextField();
		volume = new RoundedJTextField();
		editorial = new RoundedJTextField();
		nameAuthor = new RoundedJTextField();
		lastNameAuthor = new RoundedJTextField();
		biographyAuthor = new RoundedJTextField();
		save = new JButton();
		save.addActionListener(actionListener);
		save.setActionCommand(Commads.C_SAVE_BOOK.toString());
		RoundedButton.makeRounded(save, TextConstants.SAVE_BUTTON_TEXT, 25, ColorConstants.YELLOW,
				ColorConstants.LIGHT_BROWN, Color.BLACK, FontConstants.PUCK_BOLD_BOLD_FONT_15, 200, 50);
		CreationCardPanel creationCardPanel = new CreationCardPanel(TextConstants.CREATE_BOOK_BUTTON_TEXT, title,
				TextConstants.TITLE_BOOK_TEXT, ISBNCode, TextConstants.ISBN_CODE_TEXT, volume,
				TextConstants.VOLUME_TEXT, editorial, TextConstants.EDITORIAL_TEXT, nameAuthor,
				TextConstants.FIRST_NAME_AUTHOR_TEXT, lastNameAuthor, TextConstants.LAST_NAME_AUTHOR_TEXT,
				biographyAuthor, TextConstants.BIOGRAPHY_AUTHOR_TEXT, TextConstants.TITLE_DATA_BOOK_TEXT,
				TextConstants.TITLE_DATA_AUTHOR_TEXT, save);

		this.add(creationCardPanel);
	}
}
