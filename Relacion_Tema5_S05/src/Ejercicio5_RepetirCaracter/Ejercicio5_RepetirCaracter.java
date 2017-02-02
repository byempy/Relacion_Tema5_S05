package Ejercicio5_RepetirCaracter;

public class Ejercicio5_RepetirCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter = 'b';
		int veces = 2;
		
		System.out.println(repiteChar(caracter, veces));
	}
	
	public static String repiteChar(char caracter, int veces){
		String cadena = "";
		
		for(int i=0; i < veces; i++){
			cadena = cadena + caracter;
		}
		
		return cadena;
	}

}
