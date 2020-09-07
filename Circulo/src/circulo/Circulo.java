package circulo;

public class Circulo {
	double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	
	//metodo
	
	public double calcularArea() {
		double area = this.radio * this.radio * 3.14;
		
		return area;
	}
	
	public String toString() {
	return " Mi circulo tiene radio " + this.radio;
	}
}
