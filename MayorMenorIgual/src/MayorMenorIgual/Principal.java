package MayorMenorIgual;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primero;
		int segundo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		
		primero = teclado.nextInt();
				
		System.out.println("Introduce el segundo numero: ");
		
		segundo = teclado.nextInt();
		
		if(primero == segundo) {
			System.out.println("Son iguales");
		} else if(primero > segundo) {
			System.out.println("El primero es mayor");
		} else {
			System.out.println("El primero es menor");
		}
		
	}

}
