package DefinirNombrePrecioEIva;

public class DefinirNombrePrecioEIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreProducto = "manzana";
		double precio = 10;
		double iva = 0.21;
		double precioConIva = precio * iva + precio;
		
		System.out.println("El precio con iva es: " + precioConIva);
		
	}

}
