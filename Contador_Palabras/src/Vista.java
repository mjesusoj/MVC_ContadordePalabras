import java.awt.FlowLayout;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vista extends JFrame{

	private static final long serialVersionUID = 1L;

	TextArea txt = new TextArea("Escribe Aquí");
	JLabel lblResultado = new JLabel("Aquí aparece el recuento de las Palabras");
	JButton btnContar = new JButton("Contar Palabras");
	
	Vista()
	{
		setTitle("Contar Palabras");
		setLayout(new FlowLayout());
		add(txt);
		add(lblResultado);
		add(btnContar);
		setSize(500,250);
		setResizable(false);
		setVisible(true);
	}
}