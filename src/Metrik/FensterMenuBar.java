package Metrik;

import java.awt.*;
import java.awt.event.*;

public class FensterMenuBar extends MenuBar {
	
	private Menu mHintergrund;
	private Menu mRadius;
	
	public FensterMenuBar() {
		MenuItem white = new MenuItem("Weiß");
		white.setActionCommand("white");
		
		MenuItem green = new MenuItem("Grün");
		green.setActionCommand("green");
		
		MenuItem red = new MenuItem("Rot");
		red.setActionCommand("red");
		
		MenuItem radius1 = new MenuItem("25");
		radius1.setActionCommand("25");
		
		MenuItem radius2 = new MenuItem("50");
		radius2.setActionCommand("50");
		
		MenuItem radius3 = new MenuItem("75");
		radius3.setActionCommand("75");
		
		HintergrundListener hintergrundListener = new HintergrundListener();
		white.addActionListener(hintergrundListener);
		green.addActionListener(hintergrundListener);
		red.addActionListener(hintergrundListener);
		
		RadiusListener radiusListener = new RadiusListener();
		radius1.addActionListener(radiusListener);
		radius2.addActionListener(radiusListener);
		radius3.addActionListener(radiusListener);
		
		mHintergrund = new Menu("Hintergrundfarbe");
		mHintergrund.add(white);
		mHintergrund.add(green);
		mHintergrund.add(red);
		
		mRadius = new Menu("Radius");
		mRadius.add(radius1);
		mRadius.add(radius2);
		mRadius.add(radius3);
		
		add(mHintergrund);
		add(mRadius);
	}
	
}