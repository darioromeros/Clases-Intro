package Contador;

public class Contador {

	int numero;
	
	public Contador(int numero) {
		this.numero = numero;
	}
	
	public void incrementarContador() {
		this.numero = this.numero + 1;
	}
	
	public String toString() {
		return "Contador: " + this.numero;
	}
}
