package Metrik;

import java.awt.*;
import java.awt.event.*;

public class Zeichner extends Canvas implements MouseListener{
	private int durchmesser;
	private int xKoordinate, yKoordinate;
	
	public Zeichner() {
		durchmesser = 50;
		setSize(500, 500);
		addMouseListener(this);
	}

	public void paint(Graphics2D g2d) {
		g2d.setFont(new Font("Consolas", Font.PLAIN, 16));
		
		if(Fenster.getKreisCount() == 2) {
			g2d.clearRect(0, 0, 500, 500);
			Fenster.setKreisCount(0);
		}else {
			Fenster.setKreisCount(Fenster.getKreisCount() +1);
			g2d.drawOval(xKoordinate, yKoordinate, durchmesser, durchmesser);
			g2d.drawString("Kreis "+Fenster.getKreisCount()+": X:"+xKoordinate+" Y:"+yKoordinate, 20, (20*Fenster.getKreisCount()));
		}
	}
	
	public void setDurchmesser(int d) {
		durchmesser = d;
	}
	
	@Override
	public void mouseClicked(MouseEvent event) {
		Graphics2D g2d = (Graphics2D) getGraphics();
		
		if(event.getClickCount() == 2) {
			xKoordinate = event.getX() - durchmesser/2;
			yKoordinate = event.getY() - durchmesser/2;
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
