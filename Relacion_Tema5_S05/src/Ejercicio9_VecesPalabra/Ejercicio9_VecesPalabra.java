package Ejercicio9_VecesPalabra;

public class Ejercicio9_VecesPalabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Moto vieja moto nueva moto bonita";
		String palabra = "moto";
		
		System.out.println("La palabra '" + palabra + "' en la cadena '" + cadena + "'");
		System.out.println("Aparece: " + numPalabra(cadena, palabra));
	}

	public static int numPalabra(String cadena, String palabra){
		char cadenita[] = cadena.toCharArray();
		String palabra2 = "";
		int contador = 0;
		
		for(int i=0; i < cadenita.length; i++){
			if(cadenita[i] == ' ' || i == cadenita.length-1){
				if(i == cadenita.length-1){
					palabra2 = palabra2 + cadenita[i];
				}
				if(palabra2.equalsIgnoreCase(palabra)){
					contador++;
				}
				palabra2 = "";
			}else{
				palabra2 = palabra2 + cadenita[i];
			}
		}
		
		return contador;
	}
	
}
