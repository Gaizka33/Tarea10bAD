package ej1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CrearFicheroJson {
	private List<Alumno> listaAlumnos;
	private Gson gson;
	private FileWriter writer;

	public CrearFicheroJson(List<Alumno> lista) {
		this.listaAlumnos = lista;
		this.gson = new GsonBuilder().setPrettyPrinting().create();
		crearFichero();
	}

	private void crearFichero() {
		try {
			this.writer = new FileWriter("persona.json");
			escribirEnElFichero();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void escribirEnElFichero() {
		gson.toJson(listaAlumnos, writer);

	}
}
