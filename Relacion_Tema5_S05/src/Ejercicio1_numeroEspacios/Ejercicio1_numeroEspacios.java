package Ejercicio1_numeroEspacios;

public class Ejercicio1_numeroEspacios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String moto = " La moto me la robaron ";
		
		System.out.println("El número de espacios de la cadena '" +  moto + "' es : " + numEspacios(moto));
	}
	
	public static int numEspacios(String cadena){
		char cadenita[] = cadena.toCharArray();
		int contador = 0;
		
		for(int i=0; i < cadenita.length; i++){
			if(cadenita[i] == ' '){
				contador++;
			}
		}
		
		return contador;
	}

}
