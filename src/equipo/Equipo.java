package equipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Equipo {
	private String id;
	private String nombre;
	private String descripcion;
	
	public Equipo(String id, String nombre, String descripcion) throws FileNotFoundException {
		this.setId(id);
		this.setNombre(nombre);
		this.setDescripcion(descripcion);
		
		
		
		String filePath = "/Proyecto_Integrador_Grupo_O/src/recursos/resultados.csv";
		File archivoCSV = new File(filePath);
		
		Scanner lector = new Scanner(archivoCSV);
		
		while (lector.hasNextLine()) {
		    String linea = lector.nextLine();
		    String[] datos = linea.split(",");
		    // aquí puedes hacer algo con los datos separados
		}
		
		
		}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
		

}
