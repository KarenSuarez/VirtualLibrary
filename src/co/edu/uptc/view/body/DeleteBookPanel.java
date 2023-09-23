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

public class DeleteBookPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField code;
	private JButton deleteButton;

	public DeleteBookPanel(ActionListener actionListener) {
		this.setBackground(Color.LIGHT_GRAY);
		code = new RoundedJTextField();
		deleteButton = new JButton();
		deleteButton.addActionListener(actionListener);
		deleteButton.setActionCommand(Commads.C_DELETE_BOOK_ACTION.toString());
		RoundedButton.makeRounded(deleteButton, TextConstants.DELETE_BUTTON_TEXT, 25, Color.GRAY,
				ColorConstants.LIGHT_BROWN, Color.WHITE, FontConstants.PUCK_BOLD_BOLD_FONT_15, 200, 50);

		DeleteCardPanel deleteCardPanel = new DeleteCardPanel(TextConstants.DELETE_BOOK_BUTTON_TEXT,
				TextConstants.ISBN_CODE_TEXT, code, deleteButton);
		this.add(deleteCardPanel);
	}

	public int getCode() {
		return Integer.valueOf(code.getText());
	}

	public JButton getDeleteButton() {
		return deleteButton;
	}

}
