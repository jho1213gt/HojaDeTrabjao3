/**
 *
 * @author Aaron Giron, Carnet: 13042
 * @author kuk Ho Chung, Carnet: 13
 * @author Max de Leon, Carnet: 13
 * 
 * Metodo Sort para ordenamiento de numeros 
 */

package hdt3.pkg1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.List;


public class MergeSort {
	public static void mergeSort(ArrayList<Integer> data, int n){
		mergeSortRecursive(data,new int[n],0,n-1);
		System.out.println("LISTA ARREGLADA (MergeSort)");
		for(int i = 0; i<data.size(); i++){
			System.out.println(i+"."+data.get(i));
		}
/* Se guarda la lista ya ordenada mediante el m�todo MergeSort en un archivo de texto
 * llamado de la misma manera "MergeSort.txt" en el cual se encuentra la lista llena
 */
		
		File archivo = new File("MergeSort.txt");
		try{
			FileWriter lector = new FileWriter(archivo);
			BufferedWriter memoria = new BufferedWriter(lector);
			PrintWriter escribir = new PrintWriter(memoria);
			System.out.println("LISTA NORMAL");
			for(int i = 0; i<data.size();i++){
				System.out.println(i+". "+data.get(i));
				escribir.write(data.get(i)+"\n");
				memoria.newLine();
			}
			escribir.close();
		}
		catch(Exception e){
			System.out.println("Error al escribir");
		}
		
	}

	private static void merge(ArrayList<Integer> lista, int temp[], int low, int middle, int high){
		int ri = low; 
		int ti = low; 
		int di = middle; 
	
		while (ti < middle && di <= high){
			if (lista.get(di) < lista.get(ti)) {
				lista.set(ri++, lista.get(di++));
			} else {
				lista.set(ri++, temp[ti++]);
			}
		}
		while (ti < middle){
			lista.set(ri++, temp[ti++]);
		}
	}
    
	private static void mergeSortRecursive(ArrayList<Integer> lista, int temp[], int low, int high){
		int n = high-low+1;
		int middle = low + n/2;
		int i;
	
		if (n < 2) return;

		for (i = low; i < middle; i++){
			temp[i]=lista.set(i, lista.get(i));
		}
		mergeSortRecursive(lista,temp,low,high-1);
		mergeSortRecursive(lista,temp,middle,high);
		merge(lista,temp,low,middle,high);
	
	}
}