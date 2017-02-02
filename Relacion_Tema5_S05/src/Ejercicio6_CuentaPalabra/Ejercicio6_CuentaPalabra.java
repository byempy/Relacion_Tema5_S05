package Ejercicio6_CuentaPalabra;

public class Ejercicio6_CuentaPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena ="La moto me la robaron";
		
		System.out.println("La cadena '" + cadena + "' contiene '" + numPalabras(cadena) + "' palabras");
	}
	
	public static int numPalabras(String cadena){
		int contador = 0;
		for(int i=0; i < cadena.length(); i++){
			if(cadena.charAt(i) == ' ' || i == cadena.length()-1){
				contador++;
			}
		}
		return contador;
	}

}
