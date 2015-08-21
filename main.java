#main
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Universidad del Valle de Guatemala
Algoritmos y Estructura de Datos
Sección: 10
Jose Angel Ochoa Carne: 14230
Diego Sosa. Carné: 14735
30/07/2015
Hoja de Trabajo 5
*/

public class main{
	
	public static void main(String[] args) {
		Calculadora<Double> nCalculadora = new Calculadora<Double>();
	    
		try {
			nCalculadora.first();
			nCalculadora.readFile("datos.txt");
		} 	catch(FileNotFoundException e){
			System.out.println("Error: Fichero no encontrado");
			System.out.println(e.getMessage());
		}
		catch(Exception e){
			System.out.println("Error de lectura del fichero");
			System.out.println(e.getMessage());
		}
		
	}
}
