package Metrik;

import java.awt.*;
import java.awt.event.*;

public class Fenster extends Frame implements WindowListener{
	static int kreisCount;
	private static Zeichner fZeichner;
	
	public Fenster() {
		kreisCount = 0;
		fZeichner = new Zeichner();
		
		setTitle("Metrik 1.1.1");
		setSize(500, 500);
		setVisible(true);
		
		addWindowListener(this);
		add(fZeichner);
	}
	
	public static int getKreisCount() {
		return kreisCount;
	}
	
	public static void setKreisCount(int k) {
		kreisCount = k;
	}

	public void windowActivated(WindowEvent arg0) {}

	public void windowClosed(WindowEvent arg0) {}
	
	public void windowClosing(WindowEvent arg0) {
		dispose();
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent arg0) {}

	public void windowDeiconified(WindowEvent arg0) {}

	public void windowIconified(WindowEvent arg0) {}

	public void windowOpened(WindowEvent arg0) {}

}
