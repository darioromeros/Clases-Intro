package TrianguloEquilatero;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primerLado;
		int segundoLado;
		int tercerLado;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer lado del tri�ngulo: ");
		
		primerLado = teclado.nextInt();
		
		System.out.println("Introduzca el segundo lado del tri�ngulo: ");
		
		segundoLado = teclado.nextInt();
		
		System.out.println("Introduzca el tercer lado del tri�ngulo: ");
		
		tercerLado = teclado.nextInt();
		
		if(primerLado == segundoLado && (segundoLado == tercerLado) && primerLado == tercerLado) {
			
			System.out.println("El tri�ngulo es equil�tero");
			
		}	else {
			
			System.out.println("El tri�ngulo NO es equil�tero");

		}


		
		
	}

}
