
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche miCocheRojo = new Coche();
		Coche miCocheGranate = new Coche();
		
		
		miCocheRojo.marca = "Seat";
		miCocheGranate.marca = "Volvo";
		
		miCocheRojo.modelo = "Ibiza";
		miCocheGranate.modelo = "S70";
		
		miCocheRojo.color = "Rojo";
		miCocheGranate.color = "Granate";
		
		miCocheRojo.a�o = 2000;
		miCocheGranate.a�o = 1994;
		
		miCocheRojo.puertas = 3;
		miCocheGranate.puertas = 5;
		
		
		System.out.println(miCocheRojo.marca + " " +  miCocheRojo.modelo + " " + miCocheRojo.color + " " + miCocheRojo.a�o + " " + miCocheRojo.puertas + " puertas");
		System.out.println(miCocheGranate.marca + " " +  miCocheGranate.modelo + " " + miCocheGranate.color + " " + miCocheGranate.a�o + " " + miCocheGranate.puertas + " puertas");
		
	}

}
