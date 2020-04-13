import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

public class MyPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Random r;
	private int x_katt;
	private int y_katt;
	private int x_golyo,y_golyo;
	
	public MyPanel() {
		setBackground(Color.DARK_GRAY);
		r=new Random();
		x_golyo=r.nextInt(950);
		y_golyo=r.nextInt(400);
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				x_katt=e.getX();
				y_katt=e.getY();

				System.out.println("x_katt= "+x_katt+"   y_katt= "+y_katt);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	


	public int getX_golyo() {
		return x_golyo;
	}

	public void setX_golyo(int x_golyo) {
		this.x_golyo = x_golyo;
	}

	public int getY_golyo() {
		return y_golyo;
	}

	public void setY_golyo(int y_golyo) {
		this.y_golyo = y_golyo;
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.pink);
		
		g.fillOval(x_golyo, y_golyo, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(0, 0, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(430, 0, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(430, 430, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(0, 190, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(0, 430, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(950, 430, 30, 30);
		
		g.setColor(Color.red);
		g.fillOval(950, 0, 30, 30);
		
		g.setColor(Color.black);
		g.fillOval(950, 190, 30, 30);
	}

	public int getX_katt() {
		return x_katt;
	}

	public void setX_katt(int x_kat) {
		this.x_katt = x_katt;
	}



	public int getY_katt() {
		return y_katt;
	}

	public void setY_katt(int y_katt) {
		this.y_katt = y_katt;
	}
	
}
