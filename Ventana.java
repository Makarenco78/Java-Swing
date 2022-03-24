import javax.swing.*;

public class Ventana{
	public static void main(String[] args){
		JFrame f = new JFrame("Titulo de ventana");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		int AnchoB=200, AnchoB=80; 
		JButton b1 = new JButton("Boton 1");
		
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");

		f.add(b1);
		f.add(b2);
		f.add(b3);

	}
}