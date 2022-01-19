
public class libroApp {

	public static void main(String[] args) {
		
		Libro l1 = new Libro(978803022, "El señor de los anillos", "John R.R. Tolkien", 1392); //llenamos l1
		Libro l2 = new Libro(978745150, "Los juegos del hambre", "Suzanne Collins", 374); //llenamos l2
		
		System.out.println(l1 + "\n" + l2); //mostramos l1 y l2
	
		Libro.paginas(l1, l2); // llamamos al metodo paginas para saber cual de los dos tiene mas paginas
	}

}