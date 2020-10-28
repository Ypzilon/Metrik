package Metrik;

import java.awt.*;
import java.awt.event.*;

public class RadiusListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		Zeichner zeichner = Fenster.getZeichner();

		switch (event.getActionCommand()) {
		case "25":
			zeichner.setDurchmesser(25);
			break;
		case "50":
			zeichner.setDurchmesser(50);
			break;
		case "75":
			zeichner.setDurchmesser(75);
			break;
		}

	}

}