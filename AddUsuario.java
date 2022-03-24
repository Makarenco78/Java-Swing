import javax.swing.*;
import java.awt.*;

public class AddUsuario extends JFrame{
	AddUsuario addUsuario;

	public AddUsuario(){
		super("Ventana Usuario");
		this.setSize(400, 300);

		Container contentPanel = getContentPane();
 		GridLayout gridLayout = new GridLayout(4,3);
 		
 		gridLayout.setHgap(5); gridLayout.setVgap(5);
 		contentPanel.setLayout(gridLayout);

		initComponents();
		
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	
		
	}

	private void initComponents(){
		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
	}

}