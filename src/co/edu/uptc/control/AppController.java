package co.edu.uptc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.uptc.view.PrincipalFrame;

public class AppController implements ActionListener {

	private PrincipalFrame frontend;
//  private Library backend;

	public AppController() {
		frontend = new PrincipalFrame(this);
	}

	public PrincipalFrame getFrontend() {
		return frontend;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commads.valueOf(e.getActionCommand())) {
		case C_ADD_BOOK:
			frontend.openCreationBookPanel();
			break;
		case C_DELETE_BOOK:
			frontend.openDeleteBookPanel();
			break;
		case C_DELETE_BOOK_ACTION:
			// frontend.updateTableBooks();
			break;
		default:
			break;

		}

	}

	public static void main(String[] args) {
		new AppController();
	}

}