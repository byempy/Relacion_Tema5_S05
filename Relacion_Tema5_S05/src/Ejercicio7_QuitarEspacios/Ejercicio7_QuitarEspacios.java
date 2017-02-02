package Ejercicio7_QuitarEspacios;

public class Ejercicio7_QuitarEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "El compañero esta enfermo";
		String cadena2 = quitarEspacios(cadena);
		
		System.out.println("La cadena '" + cadena + "' sin espacios: " + cadena2);
	}
	
	public static String quitarEspacios(String cadena){
		String cadena2 = "";
		for(int i=0; i < cadena.length(); i++){
			if(cadena.charAt(i) != ' '){
				cadena2 = cadena2 + cadena.charAt(i);
			}
		}
		
		return cadena2;
	}

}
