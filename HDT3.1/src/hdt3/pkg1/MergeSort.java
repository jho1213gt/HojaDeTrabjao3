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
/**
 *
 * @author GNXN000000
 */
public class MergeSort {
	public static void mergeSort(ArrayList<Integer> lista, int n){
		mergeSortRecursive(lista,new int[n],0,n-1);
		System.out.println("LISTA ARREGLADA (MergeSort)");
		for(int i = 0; i<lista.size(); i++){
			System.out.println(i+"."+lista.get(i));
		}
/* Se guarda la lista ya ordenada mediante el m�todo MergeSort en un archivo de texto
 * llamado de la misma manera "MergeSort.txt" en el cual se encuentra la lista llena
 */
		/*
		 * KUK CUANDO TERMINES DE ARREGLAR LO DEL MERGESORT PODES QUITAR ESTO (DESCOMENTAR)
		 * Y YA PODES GUARDAR LA LISTA ORDENADA EN UN ARCHIVO DE TEXTO CON EL NOMBRE.
		File archivo = new File("MergeSort.txt");
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
		*/
	}

	private static void merge(ArrayList<Integer> lista, int temp[], int low, int middle, int high){
		int ri = low; 
		int ti = low; 
		int di = middle; 
	
		while (ti < middle && di <= high){
			if (lista.get(di) < temp[ti]) {
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
			lista.set(i, lista.get(i));
		}
		mergeSortRecursive(lista,temp,low,middle-1);
		mergeSortRecursive(lista,temp,middle,high);
		merge(lista,temp,low,middle,high);
	
	}
}