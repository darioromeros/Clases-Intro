package PrecioConYSinIva;

public class PrecioConYSinIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreProducto = "manzana";
		double precio = 10;
		int cantidad = 10;
		double iva = 0.21;
		double precioConIva = precio * iva + precio;
		
		double factura = cantidad * precioConIva;
		
		System.out.println("El precio con iva es: " + factura + " €");
		
	}

}
