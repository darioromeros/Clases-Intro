package circulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo miPrimerCirculo = new Circulo(15);
		
		double area = miPrimerCirculo.calcularArea();
		
		System.out.println("Area: " + area);
		
		System.out.println(miPrimerCirculo);
	}

}
