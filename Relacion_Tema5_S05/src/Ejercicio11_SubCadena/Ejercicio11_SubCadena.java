package Ejercicio11_SubCadena;

public class Ejercicio11_SubCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "La moto me la robaron";
		String subcadena = "La moto";

		System.out.println("La nueva cadena de '" + cadena + "' sería: "
				+ subCadena(cadena, subcadena));
	}

	public static String subCadena(String cadena, String subcadena) {
		int posicion = cadena.indexOf(subcadena);
		char cadenita[] = cadena.toCharArray();
		String cadenanueva = "";

		if (posicion >= 0) {
			cadenita[posicion] = '*';
			for (int i = 0; i < cadenita.length; i++) {
				cadenanueva = cadenanueva + cadenita[i];
			}
		} else {
			cadenanueva = "\nERROR: No se encontro la subcadena";
		}

		return cadenanueva;
	}

}
