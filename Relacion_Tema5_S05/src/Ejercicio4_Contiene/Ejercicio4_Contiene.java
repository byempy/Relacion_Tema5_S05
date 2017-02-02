package Ejercicio4_Contiene;

public class Ejercicio4_Contiene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "El compañero es un mierdas";
		char caracter = 'f';
		System.out.println("El caracter '" + caracter + "' aparece en la cadena '" + cadena + "'??? " + Contiene(cadena, caracter));
	}
	
	public static boolean Contiene(String cadena, char caracter){
		for(int i=0; i < cadena.length(); i++){
			if(cadena.charAt(i) == caracter){
				return true;
			}
		}
		
		return false;
	}

}
