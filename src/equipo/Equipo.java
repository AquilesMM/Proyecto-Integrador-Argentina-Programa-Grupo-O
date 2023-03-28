package equipo;

import java.io.File;
import equipo.Equipo;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Equipo {
	private int id;
	private Equipo nombre;
	private Equipo descripcion;
	private static int contadorId;
	
	public Equipo() {
		this.id = ++contadorId;
	}
	
	public Equipo( Equipo nombre, Equipo descripcion) throws FileNotFoundException {
		this ();
		this.nombre = nombre;
		this.descripcion = descripcion;
		
		
		int i = 0;
		String filePath = "src/recursos/resultados.csv";
		File archivoCSV = new File(filePath);
		
		Scanner lector = new Scanner(archivoCSV);
		
		while (lector.hasNextLine()) {
		    String linea = lector.nextLine();
		    String[] datos = linea.split(",");
		    System.out.println(datos[i]);
		}
		
		
		}

	public int getId() {
		return id;
	}

	public Equipo getNombre() {
		return nombre;
	}

	public void setNombre(Equipo nombre) {
		this.nombre = nombre;
	}

	public Equipo getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(Equipo descripcion) {
		this.descripcion = descripcion;
	}
		

}
