public class ClasePrincipal {
	public static void main(String[] args) { 
		Vista v = new Vista();
		Modelo m = new Modelo();
		new Controlador(v, m); 
	}
}
