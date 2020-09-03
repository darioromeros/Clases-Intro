package EsMultiploDe;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primero;
		int segundo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce primer numero: ");
		
		primero = teclado.nextInt();
		
		System.out.println("Introduce segundo numero: ");

		segundo = teclado.nextInt();
		
		if(primero % segundo == 0 || segundo % primero == 0) {
			System.out.println(primero + " es multiplo de " + segundo);
		} else {
			System.out.println(primero + " NO es multiplo de " + segundo);
		}
	}

}
