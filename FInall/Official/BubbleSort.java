/*
* Universidad del Valle de Guetmala
* Miembros: Aaron Giron 13042; Kuk Ho Chung 13279; Max de Leon 13012
* Clase: Algoritmos y Estructuras de Datos
* Seccion: 30
* Codigos Bubble, Quick, Merge e Inserion Srot se tomaron como referencias los del libro de texto
* Referencia: Duane A. Bailey. (2007). Java Structures: Data Structructures in Java for the Principled Programmer. Edicion sqrt(7)
*/


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class BubbleSort {
/*
 * BubbleSort utilizado para ordenar los numeros del archivo de texto que se trabajo
 * de manera ascendente para luego cargarlo en otro archivo de texto ya de manera
 * ordenada.
 */
	public static void BubbleSort(ArrayList<Integer> lista, int num){
		int cambio;
		for(int i = lista.size()-1; i >= 0; i--){
			for(int j = 0; j<i; j++){
				if(lista.get(j) > lista.get(j+1)){
					cambio = lista.get(j);
					lista.set(j, lista.get(j+1));
					lista.set(j+1, cambio);
				}
			}
		}
		System.out.println("LISTA ARREGLADA (BubbleSort)");
		for(int i = 0; i<num; i++){
			System.out.println(i+"."+lista.get(i));
		}
/* Se guarda la lista ya ordenada mediante el m�todo BubbleSort en un archivo de texto
 * llamado de la misma manera "BubbleSort.txt" en el cual se encuentra la lista llena
 */
		File archivo = new File("BubbleSort.txt");
		try{
			FileWriter lector = new FileWriter(archivo);
			BufferedWriter memoria = new BufferedWriter(lector);
			PrintWriter escribir = new PrintWriter(memoria);
			System.out.println("LISTA NORMAL");
			for(int i = 0; i<lista.size();i++){
				System.out.println(i+". "+lista.get(i));
				escribir.write(lista.get(i)+"\n");
				memoria.newLine();
			}
			escribir.close();
		}
		catch(Exception e){
			System.out.println("Error al escribir");
		}
	}
}
