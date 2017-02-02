package Ejercicio8_vecesCaracter;

public class Ejercicio8_vecesCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena ="Compañero compañero compañeeero";
		char caracter = 'e';
		
		System.out.println("El caracter '" + caracter + "' se repite: " + vecesCaracter(cadena, caracter));
	}
	
	public static int vecesCaracter(String cadena, char caracter){
		int contador = 0;
		
		for(int i=0; i < cadena.length(); i++){
			if(cadena.charAt(i) == caracter){
				contador++;
			}
		}
		
		return contador;
	}

}
