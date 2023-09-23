package co.edu.uptc.view.body;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.utilities.RoundedPanel;

public class CreationCardPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel title;
	private CreationDataCardPanel creationDataCardPanel;
	private JButton saveInfo;

	public CreationCardPanel(String titleText, JTextField titleBook, String titleBookText, JTextField ISBNCode, String ISBNCodeText,
			JTextField volume, String volumeText, JTextField editorial, String editorialText, JTextField nameAuthor,
			String nameAuthorText, JTextField lastNameAuthor, String lastNameAuthorText, JTextField biographyAuthor,
			String biographyAuthorText, String titleDataBookText, String titleDataAuthorText, JButton save) {
		this.setBackground(Color.LIGHT_GRAY);
		RoundedPanel roundedPanel = new RoundedPanel(ColorConstants.LIGHT_BROWN, 30);
		roundedPanel.setPreferredSize(new Dimension(800, 400));
		roundedPanel.setLayout(new BorderLayout());

		title = new JLabel(titleText);
		title.setFont(FontConstants.PUCK_BOLD_BOLD_FONT_26);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBorder(new EmptyBorder(30, 0, 0, 0));
		roundedPanel.add(this.title, BorderLayout.NORTH);

		creationDataCardPanel = new CreationDataCardPanel(titleBook, titleBookText, ISBNCode, ISBNCodeText, volume,
				volumeText, editorial, editorialText, nameAuthor, nameAuthorText, lastNameAuthor, lastNameAuthorText,
				biographyAuthor, biographyAuthorText, titleDataBookText, titleDataAuthorText);
		roundedPanel.add(creationDataCardPanel, BorderLayout.CENTER);

		this.saveInfo = save;
		roundedPanel.add(saveInfo, BorderLayout.SOUTH);
		this.add(roundedPanel);
	}
}
