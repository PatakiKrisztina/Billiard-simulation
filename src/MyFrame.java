import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private MyPanel p;
	private Szal szal;
	private int n;
	
	public MyFrame(int n) {
		this.n=n;
		setVisible(true);
		setBounds(0,0,1000,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		p=new MyPanel();
		add(p);
		
		szal=new Szal(this,n);
		szal.start();
		
	}

	public MyPanel getP() {
		return p;
	}

	public void setP(MyPanel p) {
		this.p = p;
	}
	
}
