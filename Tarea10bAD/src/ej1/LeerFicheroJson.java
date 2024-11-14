package ej1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class LeerFicheroJson {
	private final File fichero = new File("persona.json");
	private List<Alumno> lista;

	public LeerFicheroJson() {
		setLista(new ArrayList<Alumno>());
		crearListaDelFichero();
	}

	private void leerFichero() {
		for (Alumno alumno : lista) {
			System.out.println(alumno.toString());
		}
	}

	private void crearListaDelFichero() {
		ObjectMapper leer = new ObjectMapper();
		try {
			lista = (leer.readValue(fichero, new TypeReference<List<Alumno>>() {
			}));
			leerFichero();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Alumno> getLista() {
		return lista;
	}

	public void setLista(List<Alumno> lista) {
		this.lista = lista;
	}
}
