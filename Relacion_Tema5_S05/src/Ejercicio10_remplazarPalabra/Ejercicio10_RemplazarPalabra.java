package Ejercicio10_remplazarPalabra;

public class Ejercicio10_RemplazarPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "El compa�ero esta enamorado";
		String palabra = "compa�ero";
		String palabra2 = "bb";
		
		System.out.println("La cadena '" + cadena + "' despues de la funci�n queda as�: " + remplazar(cadena,palabra, palabra2));
	}
	
	public static String remplazar(String cadena, String palabra, String palabra2){
		String cadena2 = cadena.replaceAll(palabra, palabra2);
		return cadena2;
	}

}
