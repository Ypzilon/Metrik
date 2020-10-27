package Metrik;

import java.awt.*;
import java.awt.event.*;

public class FensterMenuBar extends MenuBar {
	
	private Menu mHintergrund;
	
	public FensterMenuBar() {
		MenuItem white = new MenuItem("Weiß");
		white.setActionCommand("white");
		
		MenuItem green = new MenuItem("Grün");
		green.setActionCommand("green");
		
		MenuItem red = new MenuItem("Rot");
		red.setActionCommand("red");
		
		FensterMenuListener fensterMenuListener = new FensterMenuListener();
		white.addActionListener(fensterMenuListener);
		green.addActionListener(fensterMenuListener);
		red.addActionListener(fensterMenuListener);
		
		mHintergrund = new Menu("Hintergrundfarbe");
		mHintergrund.add(white);
		mHintergrund.add(green);
		mHintergrund.add(red);
		
		add(mHintergrund);
	}
	
}