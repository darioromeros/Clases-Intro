package PooTriangulo;

public class Triangulo {

	int base;
	int altura;
	
	public Triangulo(int base, int altura) {
	
		this.base = base;
		this.altura = altura;
		
	}
	
	public double calcularArea() {
		double area = base * altura / 2;
		return area;
	}
		
}
