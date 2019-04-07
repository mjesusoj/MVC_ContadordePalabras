import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements ActionListener, WindowListener {
	// Objetos
	Vista objVista = null; 
	Modelo objModelo = null;
	
	// Pasar por parámetros los objetos.
	public Controlador(Vista objVista, Modelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 
		
		// Listeners
		objVista.btnContar.addActionListener(this);
		objVista.addWindowListener(this); 
	}
	
	@Override
	public void actionPerformed(ActionEvent evento)	{ 
		// Si se ha pulsado el botón de la vista (btnContar).
		if(objVista.btnContar.equals(evento.getSource())) {
			try {
				objVista.txt.selectAll();
				String textointroducido = this.objVista.txt.getText();
				int resultado = Modelo.contar_palabras(textointroducido);
				objVista.lblResultado.setText("Hay" + " " + resultado + " " + "palabras");
			} catch(Exception e) {
				e.printStackTrace(); 
			}
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}