package ej1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearyCargarAlumnos {
	private List<Alumno> listaAlumnos;
	private Scanner abielto = new Scanner(System.in);
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public CrearyCargarAlumnos() {
		this.listaAlumnos = new ArrayList<Alumno>();
		cargarAlumnos();
	}

	private List<Alumno> cargarAlumnos() {
		for (int i = 0; i < 5; i++) {
			listaAlumnos.add(crearAlumno());
		}
		return listaAlumnos;
	}

	private Alumno crearAlumno() {
		System.out.println("Dame la fecha de nacimiento del alumno (dd-MM-yyyy): ");
		String fechaNacimientoString = abielto.next();
		LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoString, formato);
		String fechaNcaimientoParaGson = fechaNacimiento.toString();
		
		abielto.nextLine();

		System.out.println("Dame los datos del alumno (Nombre, Apellidos, Ciclo, Curso, Grupo, NIA y Genero): ");
		String nombre = abielto.nextLine();
		String apellidos = abielto.nextLine();
		String ciclo = abielto.nextLine();
		String curso = abielto.nextLine();
		String grupo = abielto.nextLine();
		int nia = abielto.nextInt();
		char genero = abielto.next().charAt(0);

		Alumno alumno = new Alumno(nombre, apellidos, ciclo, curso, grupo, nia, genero, fechaNcaimientoParaGson);
		return alumno;
	}

	public List<Alumno> getLista() {
		return listaAlumnos;
	}
}