package ej1;

public class Main {
	public static void main(String[] args) {

		CrearyCargarAlumnos c = new CrearyCargarAlumnos();
		/*
		 no esta unused, simplemente me interesa mas que se haga directamente y que no
		 tenga que invocar un metodo, pero me molesta mucho el warning.
		*/
		@SuppressWarnings("unused")
		CrearFicheroJson cF = new CrearFicheroJson(c.getLista());
	}
}
