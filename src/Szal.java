import java.util.Random;

public class Szal extends Thread {

	private MyFrame f;
	private MyPanel p;
	private int x_katt, y_katt, y_v, x_golyo, y_golyo, x_cel, y_cel, falnakutkozott;
	private int x_v;
	private int n;
	Random r;

	public Szal(MyFrame f, int n) {
		this.f = f;
		this.n = n;
		this.p = f.getP();
		r=new Random();
	}

	@Override
	public void run() {
		
		while (x_katt == 0 && y_katt == 0) {
			x_katt = p.getX_katt();
			y_katt = p.getY_katt();
			x_golyo = p.getX_golyo();
			y_golyo = p.getY_golyo();
			x_v = (x_katt - x_golyo) / 10;
			y_v = (y_katt - y_golyo) / 10;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(i>=1) {
				
				x_golyo=r.nextInt(950);
				y_golyo=r.nextInt(400);
				p.setX_golyo(x_golyo);
				p.setY_golyo(y_golyo);
				p.setX_katt(0);
				p.setY_katt(0);
				p.repaint();
				x_katt=0;
				y_katt=0;
				while(x_katt == 0 && y_katt == 0) {
					x_katt = p.getX_katt();
					y_katt = p.getY_katt();
					x_v = (x_katt - x_golyo) / 10;
					y_v = (y_katt - y_golyo) / 10;
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			x_katt = p.getX_katt();
			y_katt = p.getY_katt();
			x_golyo = p.getX_golyo();
			y_golyo = p.getY_golyo();
			x_cel = 950;
			y_cel = 0;

			falnakutkozott = 0;
			
			while (falnakutkozott < 3 && !(x_golyo >= x_cel-30 && y_golyo <= y_cel+30)) {

				x_golyo = x_golyo + x_v;
				y_golyo = y_golyo + y_v;
				p.setX_golyo(x_golyo);
				p.setY_golyo(y_golyo);
				p.repaint();
				f.setP(p);
				f.repaint();

				System.out.println("x_golyo= " + x_golyo + "  y_golyo= " + y_golyo);
				System.out.println("x_v= " + x_v + "  y_v= " + y_v);
				System.out.println("x_katt= " + x_katt + "  y_katt= " + y_katt);

				if (x_golyo <= 0 || x_golyo >= 950) {
					falnakutkozott++;
					x_v = x_v * (-1);
				}

				if (y_golyo >= 430 || y_golyo <= 0) {
					falnakutkozott++;
					y_v = y_v * (-1);
				}

				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			if(falnakutkozott==3) {
				System.out.println("Nem sikerult :(");
			}
			else
				System.out.println("Sikerult!");
			falnakutkozott=0;
		}
	}
}
