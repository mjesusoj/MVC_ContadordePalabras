public class ClasePrincipal {
	// ClasePrincipal que llama a la vista y al modelo y se la pasa al controlador por parámetros.
	public static void main(String[] args) { 
		Vista v = new Vista();
		Modelo m = new Modelo();
		new Controlador(v, m); 
	}
}