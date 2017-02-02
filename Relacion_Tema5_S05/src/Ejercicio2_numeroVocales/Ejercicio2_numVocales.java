package Ejercicio2_numeroVocales;

public class Ejercicio2_numVocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "El compañero es un mierdas";
		
		System.out.println("La cadena '" + cadena + "' tiene " + "'" + numVocales(cadena) + "' vocales");
	}
	
	public static int numVocales(String cadena){
		int contador = 0;
		cadena = cadena.toLowerCase();
		
		for(int i=0; i < cadena.length(); i++){
			switch(cadena.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contador++;
					break;
			}
		}
		
		return contador;
	}

}
