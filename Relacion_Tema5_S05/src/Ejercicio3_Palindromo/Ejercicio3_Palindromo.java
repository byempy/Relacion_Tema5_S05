package Ejercicio3_Palindromo;

public class Ejercicio3_Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra = "ANA";
		System.out.println("La palabra es palindromo? " + esPalindromo(palabra));
	}
	
	public static boolean esPalindromo(String palabra){

		String palabravuelta = "";

		for(int i=palabra.length()-1; i >=0; i--){
			palabravuelta = palabravuelta + palabra.charAt(i);
		}
		
		return palabravuelta.equals(palabra);
	}

}
