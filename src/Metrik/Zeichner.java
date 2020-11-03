package Metrik;

import java.awt.*;
import java.awt.event.*;

public class Zeichner extends Canvas implements MouseListener{
	private int durchmesser;
	private int xKoordinate, yKoordinate;
	private int xKreis1, yKreis1;
	private int xKreis2, yKreis2;
	
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
			g2d.drawLine(xKreis1, yKreis1, xKreis2, yKreis2);
		}else {
			g2d.clearRect(0, 0, 500, 500);
			Fenster.setKreisCount(0);
		}
	}
	
	public void setDurchmesser(int d) {
		durchmesser = d;
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
