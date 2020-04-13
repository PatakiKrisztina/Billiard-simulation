
public class Main {

	public static void main(String args[]) {
		int n=5;
		try {
			n=Integer.parseInt(args[0]);
		}catch(Exception e){
			n=5;
		}
		
		new MyFrame(n);
	}
}
