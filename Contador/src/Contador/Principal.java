package Contador;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador miContadorA = new Contador(10);
		Contador miContadorB = new Contador(5);
		
		System.out.println("A " + miContadorA);
		System.out.println("B " + miContadorB);
		
		miContadorA.incrementarContador();
		
		System.out.println("A " + miContadorA);
		System.out.println("B " + miContadorB);
	}

}
