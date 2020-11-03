package Metrik;

import java.awt.*;
import java.awt.event.*;

public class Zeichner extends Canvas implements MouseListener{
	private int durchmesser;
	private int xKoordinate, yKoordinate;
	private int xKreis1, yKreis1;
	private int xKreis2, yKreis2;
	private double xRoot, yRoot;
	
	public Zeichner() {
		durchmesser = 50;
		setSize(500, 500);
		addMouseListener(this);
	}

	public void paint(Graphics2D g2d) {
		g2d.setFont(new Font("Consolas", Font.PLAIN, 16));
		
		if(Fenster.getKreisCount() == 0) {
			Fenster.setKreisCount(1);
			g2d.drawOval(xKoordinate-durchmesser/2, yKoordinate-durchmesser/2, durchmesser, durchmesser);
			xKreis1 = xKoordinate;
			yKreis1 = yKoordinate;
			g2d.drawString("Kreis "+Fenster.getKreisCount()+": X:"+xKoordinate+" Y:"+yKoordinate, 20, (20*Fenster.getKreisCount()));
		}else if(Fenster.getKreisCount() == 1) {
			Fenster.setKreisCount(2);
			g2d.drawOval(xKoordinate-durchmesser/2, yKoordinate-durchmesser/2, durchmesser, durchmesser);
			xKreis2 = xKoordinate;
			yKreis2 = yKoordinate;
			g2d.drawString("Kreis "+Fenster.getKreisCount()+": X:"+xKoordinate+" Y:"+yKoordinate, 20, (20*Fenster.getKreisCount()));
			g2d.drawString("Distanz: "+getDistance(), 20, (20+20*Fenster.getKreisCount()));
			g2d.drawLine(xKreis1, yKreis1, xKreis2, yKreis2);
		}else {
			g2d.clearRect(0, 0, 500, 500);
			Fenster.setKreisCount(0);
			reset();
		}
		
	}
	
	public void setDurchmesser(int d) {
		durchmesser = d;
	}
	
	public double getDistance() {
		xRoot = xKreis1 - xKreis2;
		yRoot = yKreis1 - yKreis2;
		return Math.sqrt(Math.pow(xRoot, 2)+Math.pow(yRoot, 2))-durchmesser;
	}
	
	public void reset() {
		xKoordinate = 0;
		yKoordinate = 0;
		xRoot = 0;
		yRoot = 0;
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		Graphics2D g2d = (Graphics2D) getGraphics();
		
		if(event.getClickCount() == 2) {
			xKoordinate = event.getX();
			yKoordinate = event.getY();
			paint(g2d);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
