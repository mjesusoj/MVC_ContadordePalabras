public class Modelo {
	public String contar_palabras(String texto) {
		int contador = 0;
		
		for (int i=0; i<texto.length();) {
			contador++;
			texto.split(" ");
			String resultado = Integer.toString(contador);
			System.out.println(contador);
			return resultado;
	}
		return null;
}
}