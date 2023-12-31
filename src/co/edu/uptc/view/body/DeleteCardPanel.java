package co.edu.uptc.view.body;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.utilities.RoundedPanel;

public class DeleteCardPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel title;
	private JLabel codeText;

	public DeleteCardPanel(String titleText, String codeText, JTextField code, JButton delete) {
		this.setBackground(Color.LIGHT_GRAY);
		
		RoundedPanel roundedPanel = new RoundedPanel(ColorConstants.LIGHT_BROWN, 30);
		roundedPanel.setPreferredSize(new Dimension(400, 200));
		roundedPanel.setLayout(new BorderLayout());

		title = new JLabel(titleText);
		title.setFont(FontConstants.PUCK_BOLD_BOLD_FONT_26);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBorder(new EmptyBorder(20, 0, 0, 0));
		roundedPanel.add(this.title, BorderLayout.NORTH);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new BorderLayout());
		dataPanel.setBackground(ColorConstants.LIGHT_BROWN);
		dataPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
		
		this.codeText = new JLabel(codeText);
		this.codeText.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
		dataPanel.add(this.codeText, BorderLayout.NORTH);
		dataPanel.add(code, BorderLayout.CENTER);
		
		roundedPanel.add(dataPanel, BorderLayout.CENTER);

		roundedPanel.add(delete, BorderLayout.SOUTH);
		this.add(roundedPanel);
	}

}
