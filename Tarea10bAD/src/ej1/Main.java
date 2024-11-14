package ej1;

public class Main {
	public static void main(String[] args) {

		CrearyCargarAlumnos c = new CrearyCargarAlumnos();
		new CrearFicheroJson(c.getLista());
		new LeerFicheroJson();
	}
}
