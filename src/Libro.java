
public class Libro {

	protected long ISBN;
	protected String titulo;
	protected String autor;
	protected int npaginas;

	//Constructor
	public Libro(long isbn, String titulo, String autor, int npaginas) {
		ISBN = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
	}

	//Calculamos cual de los dos tiene mas paginas
	public static void paginas(Libro l1, Libro l2) {

		if (l1.npaginas < l2.npaginas) { // si l2 tiene mas paginas
			System.out.println("El libro " + l2.titulo + " tiene mas paginas"); // El libro con el nombre de l2 tiene mas paginas
		} else if (l2.npaginas < l1.npaginas) { // si l1 tiene mas paginas
			System.out.println("El libro " + l1.titulo + " tiene mas paginas"); // El libro con el nombre de l1 tiene mas paginas
		} else { // O tienen las mismas paginas
			System.out.println("Tienen las mismas paginas");
		}
	}

	//ToString para mostrar el texto de los libros
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN: " + ISBN + " creado por " + autor + " tiene " + npaginas + " paginas";
	}

	//Getters y setters
	
	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long isbn) {
		ISBN = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNpaginas() {
		return npaginas;
	}

	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}
}
