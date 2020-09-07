package Biblioteca;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro miPrimerLibro = new Libro("1234", "Harry Potter", "JK Rowling", 240);
		
		System.out.println("Mi Libro: " + miPrimerLibro.titulo);
		
		Autor miAutorFavorito = new Autor("JK Rowling", 45);
		
		System.out.println("Autora: " + miAutorFavorito.nombre);
	}

}
