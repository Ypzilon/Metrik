package Metrik;

import java.awt.*;
import java.awt.event.*;

public class FensterMenuListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		Zeichner zeichner = Fenster.getZeichner();

		switch (event.getActionCommand()) {
		case "white":
			zeichner.setBackground(Color.white);
			break;
		case "green":
			zeichner.setBackground(Color.green);
			break;
		case "red":
			zeichner.setBackground(Color.red);
			break;
		}

	}

}