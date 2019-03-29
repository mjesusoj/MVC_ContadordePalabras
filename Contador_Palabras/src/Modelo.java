public class Modelo {
	/*public int contar_palabras(String texto) {
		int contador = 0;
		
		for (int i=0; i<texto.length();) {
			contador++;
		    contador += texto.split("\\s ").length;
		    System.out.println(contador);
			return contador;
	}
		return 0;
	}
	*/

public static int contar_palabras(String texto){    
    int conteoPalabras = 0;    
    boolean palabra = false;
    int finDeLinea = texto.length() - 1;

    for (int i = 0; i < texto.length(); i++) {
        // Si el char is una letra, word = true.
        if (Character.isLetter(texto.charAt(i)) && i != finDeLinea) {
            palabra = true;
            // Si el char no es una letra y aún hay más letras,
            // el contador continua.
        } else if (!Character.isLetter(texto.charAt(i)) && palabra) {
            conteoPalabras++;
            palabra = false;
            // última palabra de la cadena; si no termina con una no letra ,
        } else if (Character.isLetter(texto.charAt(i)) && i == finDeLinea) {
            conteoPalabras++;
        }
    }
    return conteoPalabras;
}
}