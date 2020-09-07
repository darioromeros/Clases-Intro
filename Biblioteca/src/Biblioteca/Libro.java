package Biblioteca;

public class Libro {

	String ISBN;
	String titulo;
	String autor;
	int paginas;
	
	public Libro(String ISBN, String titulo, String autor, int paginas) {
	
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}	
}
