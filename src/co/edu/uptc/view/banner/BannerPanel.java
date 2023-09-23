package co.edu.uptc.view.banner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.constants.ImagePathConstants;
import co.edu.uptc.view.constants.TextConstants;
import co.edu.uptc.view.utilities.JComponentsUtilities;

public class BannerPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel title; 
	private JLabel logo;
	
	public BannerPanel() {
		this.setBackground(Color.BLACK);
		this.setPreferredSize(new Dimension(0, 90));
		this.initComponents();
	}
	
	public void initComponents() {
		this.setLayout(new BorderLayout());
		logo = new JLabel();
		JComponentsUtilities.labelImage(logo, ImagePathConstants.UPTC_IMAGE_URL, 280, 80);
		this.add(logo, BorderLayout.LINE_START);
		
		title = new JLabel(TextConstants.COMPANY_NAME_TEXT);
		title.setForeground(Color.WHITE);
		title.setFont(FontConstants.PUCK_BOLD_BOLD_FONT_18);
		this.add(title);
		
		JPanel amarillo = new JPanel(); 
		amarillo.setBackground(ColorConstants.DARK_YELLOW);
		
		this.add(amarillo, BorderLayout.SOUTH);
	}
	

}
