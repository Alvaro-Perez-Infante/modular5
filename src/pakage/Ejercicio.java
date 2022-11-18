package pakage;

import java.util.Scanner;

public class Ejercicio {

	
	public static void main(String[]args) {
		Scanner teclado= new Scanner(System.in);

		Util.subrayar("EJERCICIO 05 MODULAR", "*");
		
		
		
		String letra;
		boolean resultado;
		
		letra = Util.leerString("Introduzca una letra: ");
		resultado = esVocal(letra);
	
		System.out.println(resultado);
	
	}	
		
		public static boolean esVocal(String letra){
			
			boolean resultado;
			switch(letra ) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				resultado = true;
				break;
			default : resultado = false;
				
			}
			return resultado;
		}
	
}

