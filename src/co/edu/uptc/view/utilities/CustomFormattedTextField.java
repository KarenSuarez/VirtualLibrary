package co.edu.uptc.view.utilities;

import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.Font;

public class CustomFormattedTextField extends JFormattedTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomFormattedTextField(int columns) {
		super();
		setColumns(columns);
		setForeground(Color.DARK_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(Color.WHITE);
		setBorder(null);
	}
}
