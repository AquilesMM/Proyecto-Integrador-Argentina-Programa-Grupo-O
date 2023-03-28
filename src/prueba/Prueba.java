package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) throws FileNotFoundException {
		 
		int i = 0;
		String filePath = "src/recursos/resultados.csv";
		File archivoCSV = new File(filePath);
		
		Scanner lector = new Scanner(archivoCSV);
		
		while (lector.hasNextLine()) {
		    String linea = lector.nextLine();
		    String[] datos = linea.split(",");
		    //datos = linea.split(";");
		    System.out.println(datos[i]);
	                
		}

	}
	
}
