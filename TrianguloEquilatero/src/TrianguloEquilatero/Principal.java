package TrianguloEquilatero;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primerLado;
		int segundoLado;
		int tercerLado;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca el primer lado del triángulo: ");
		
		primerLado = teclado.nextInt();
		
		System.out.println("Introduzca el segundo lado del triángulo: ");
		
		segundoLado = teclado.nextInt();
		
		System.out.println("Introduzca el tercer lado del triángulo: ");
		
		tercerLado = teclado.nextInt();
		
		if(primerLado == segundoLado && (segundoLado == tercerLado) && primerLado == tercerLado) {
			
			System.out.println("El triángulo es equilátero");
			
		}	else {
			
			System.out.println("El triángulo NO es equilátero");

		}


		
		
	}

}
