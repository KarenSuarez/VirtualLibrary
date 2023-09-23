package co.edu.uptc.view.body;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;

public class CreationDataCardPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public CreationDataCardPanel(JTextField title, String titleText, JTextField ISBNCode, String ISBNCodeText,
            JTextField volume, String volumeText, JTextField editorial, String editorialText, JTextField nameAuthor,
            String nameAuthorText, JTextField lastNameAuthor, String lastNameAuthorText, JTextField biographyAuthor,
            String biographyAuthorText, String titleDataBookText, String titleDataAuthorText) {
        this.setBackground(ColorConstants.LIGHT_BROWN);
        this.setBorder(new EmptyBorder(30, 10, 30, 10));
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.weightx = 1.0;

        JPanel dataBookPanel = new JPanel(new GridLayout(2, 2));
        dataBookPanel.setBackground(ColorConstants.LIGHT_BROWN);

        JLabel titleDescription = new JLabel(titleText);
        titleDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
        JLabel ISBNCodeDescription = new JLabel(ISBNCodeText);
        ISBNCodeDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
        JLabel volumeDescription = new JLabel(volumeText);
        volumeDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
        JLabel editorialDescription = new JLabel(editorialText);
        editorialDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);

        dataBookPanel.add(titleDescription);
        dataBookPanel.add(ISBNCodeDescription);
        dataBookPanel.add(volumeDescription);
        dataBookPanel.add(editorialDescription);
        dataBookPanel.add(title);
        dataBookPanel.add(ISBNCode);
        dataBookPanel.add(volume);
        dataBookPanel.add(editorial);

        JPanel dataAuthorPanel = new JPanel(new GridLayout(2, 3));
        dataAuthorPanel.setBackground(ColorConstants.LIGHT_BROWN);

        JLabel nameDescription = new JLabel(nameAuthorText);
        nameDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
        JLabel lastNameDescription = new JLabel(lastNameAuthorText);
        lastNameDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);
        JLabel biographyDescription = new JLabel(biographyAuthorText);
        biographyDescription.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_16);

        dataAuthorPanel.add(nameDescription);
        dataAuthorPanel.add(lastNameDescription);
        dataAuthorPanel.add(biographyDescription);
        dataAuthorPanel.add(nameAuthor);
        dataAuthorPanel.add(lastNameAuthor);
        dataAuthorPanel.add(biographyAuthor);

        JLabel titleDataBook = new JLabel(titleDataBookText);
        titleDataBook.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_20);
        titleDataBook.setBorder(new EmptyBorder(10, 0, 10, 0));

        JLabel titleDataAuthor = new JLabel(titleDataAuthorText);
        titleDataAuthor.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_20);
        titleDataAuthor.setBorder(new EmptyBorder(10, 0, 10, 0));
        
    	JSeparator separador = new JSeparator(SwingConstants.HORIZONTAL);
		separador.setForeground(Color.GRAY);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        this.add(titleDataBook, gbc);
        gbc.gridy = 1;
        this.add(dataBookPanel, gbc);
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        this.add(new JLabel(" "), gbc);
        gbc.gridy = 3;
        this.add(separador, gbc);
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        this.add(titleDataAuthor, gbc);
        gbc.gridy = 5;
        this.add(dataAuthorPanel, gbc);
    }
}
