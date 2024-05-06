
public class CadenaManipulador {
   
    public String invertirCadena(String cadena) {
	
	if (cadena == null) {
	    throw new IllegalArgumentException("La cadena no puede ser nula");
	}
	
	StringBuilder resultado = new StringBuilder(cadena);
	return resultado.reverse().toString();
    }

    public int contarVocales(String cadena) {
	if (cadena == null) {
	    throw new IllegalArgumentException("La cadena no puede ser nula");
	}
	int contador = 0;
	for (char c : cadena.toLowerCase().toCharArray()) {
	    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
		contador++;
	    }
	}
	return contador;
    }

}
