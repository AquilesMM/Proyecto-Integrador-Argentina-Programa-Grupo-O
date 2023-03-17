package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		 
			
			
			try {
				String filePath = "/Proyecto_Integrador_Grupo_O/Recursos/recursos/resultados.csv";
			    File archivoCSV = new File(filePath);
			    Scanner lector = new Scanner(archivoCSV);
			    
				String datos[] = new String[50];
				while (lector.hasNextLine()) {
				    String linea = lector.nextLine();
				     datos = linea.split(",");
				    
				    
				}
				
				
				for(int i = 0; i < datos.length; i++) {
					System.out.println(datos[i]);
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	                
			

	}

}
