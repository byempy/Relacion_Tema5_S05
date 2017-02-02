package Ejercicio11_SubCadena;

public class Ejercicio11_SubCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "La moto me la robaron, hecho de menos mi moto";
		String subcadena = "moto";

		System.out.println("La nueva cadena de '" + cadena + "' sería: "
				+ subCadena(cadena, subcadena));
	}

	public static String subCadena(String cadena, String subcadena){
		String subcadena2 = "";
		String cadena2 = "";
		char sub [] = subcadena.toCharArray();
		
		sub[0] = '*';
		
		for(int i=0; i < sub.length; i++){
			subcadena2 = subcadena2 + sub[i];
		}
		
		cadena2 = cadena.replaceAll(subcadena, subcadena2);
		
		return cadena2;
	}

}
