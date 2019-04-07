public class Modelo {

public static int contar_palabras(String textointroducido){    
    int conteoPalabras = 0;    
    boolean palabra = false;
    int finDeLinea = textointroducido.length() -1;

    // Bucle de 0 hasta la longitud del texto que se ha introducido en el textArea
    for (int i = 0; i < textointroducido.length(); i++) {
        // Si el character(char) es una letra devuelve true.
        if (Character.isLetter(textointroducido.charAt(i)) && i != finDeLinea) {
            palabra = true;
            // Si el char no es una letra y aún hay más letras, el contador continua.
        } else if (!Character.isLetter(textointroducido.charAt(i)) && palabra) {
            conteoPalabras++;
            palabra = false;
            // última palabra de la cadena; si no termina con una no letra ,
        } else if (Character.isLetter(textointroducido.charAt(i)) && i == finDeLinea) {
            conteoPalabras++;
        }
    }
    // devuelve el resultado
    return conteoPalabras;
}
}