/*
* Universidad del Valle de Guetmala
* Miembros: Aaron Giron 13042; Kuk Ho Chung 13279; Max de Leon 13012
* Clase: Algoritmos y Estructuras de Datos
* Seccion: 30
* Codigos Bubble, Quick, Merge e Inserion Srot referenciado por libro citado
* Referencia: Duane A. Bailey. (2007). Java Structures: Data Structructures in Java for the Principled Programmer. Edicion sqrt(7)
*/
import java.io.*;
import java.util.*;

public class Principal {
	private static int contador = 2000;
        private static int cont = 200;
	private static ArrayList<Integer> numeros = new ArrayList<Integer>();
        private static ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Ciclo para que siga generando numeros random y los va guardando
 * en el ArrayList del programa
 * Se crean las variables que utilizamos para la elaboracion
 * del numero random y especificamos el intervalo en el que 
 * se encontraran los numeros randoms
 */
		for(int i = 0; i < contador; i++){
			int numT = (int)(Math.random()*(2000-1));
			numeros.add(numT);
		}
		File archivo = new File("Archivo.txt");
		try{
			FileWriter lector = new FileWriter(archivo);
			BufferedWriter memoria = new BufferedWriter(lector);
			PrintWriter escribir = new PrintWriter(memoria);
			System.out.println("LISTA NORMAL");
			for(int i = 0; i<numeros.size();i++){
				System.out.println(i+". "+numeros.get(i));
				escribir.write(numeros.get(i)+"\n");
				memoria.newLine();
			}
			escribir.close();
		}
		catch(Exception e){
			System.out.println("Error al escribir");
		}
                
                for(int i = 0; i < cont; i++){
			int num = (int)(Math.random()*(2000-1));
			lista.add(num);
		}
		File archivo2 = new File("Archivo2.txt");
		try{
			FileWriter lector2 = new FileWriter(archivo2);
			BufferedWriter memoria2 = new BufferedWriter(lector2);
			PrintWriter escribir2 = new PrintWriter(memoria2);
			System.out.println("LISTA NORMAL");
			for(int i = 0; i<lista.size();i++){
				System.out.println(i+". "+lista.get(i));
				escribir2.write(lista.get(i)+"\n");
				memoria2.newLine();
			}
			escribir2.close();
		}
		catch(Exception e){
			System.out.println("Error al escribir");
		}
                
                
/*
 * Se cargan los archivos (escriben) en el archivo de texto original (random)
 * para luego en otro archivo ya guardarlos ordenados
 */
		System.out.println("----------------");
/*
 * Se crea la nueva variable comparable que se utilizara cada uno de los sort's
 */
		
		BubbleSort.BubbleSort(numeros, numeros.size());
		InsertionSort.insertionSort(numeros, numeros.size());                
		QuickSort.quickSort(numeros, numeros.size());
		MergeSort.mergeSort(lista, lista.size());
	}
}
