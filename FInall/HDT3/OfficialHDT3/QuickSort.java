/*
* Universidad del Valle de Guetmala
* Miembros: Aaron Giron 13042; Kuk Ho Chung 13279; Max de Leon 13012
* Clase: Algoritmos y Estructuras de Datos
* Seccion: 30
* Codigos Bubble, Quick, Merge e Inserion Srot referenciado por libro citado
* Referencia: 
* - Duane A. Bailey. (2007). Java Structures: Data Structructures in Java for the Principled Programmer. Edicion sqrt(7)
* - Singh N. (2014). Bubble Sort Example by using Java ArrayList. http://www.kriblog.com/j2se/util/various-bubble-sort-example-in-java-using-string-array-arraylist-linked-list-recursive.html
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class QuickSort {
    
    private static int partition(ArrayList<Integer> data, int left, int right)
    // pre: left <= right
    // post: data[left] placed in the correct (returned) location
    {
            
            while (true)
            {
                // move right "pointer" toward left
                while (left < right && data.get(left) < data.get(right)) right--;
                if (left < right) swap(data,left++,right);
                else return left;
                // move left pointer toward right
                while (left < right && data.get(left) < data.get(right)) left++;
                if (left < right) swap(data,left,right--);
                else return right;
            }
    }
    public static void quickSort(ArrayList<Integer> data, int n)
    // post: the values in data[0..n-1] are in ascending order
    {
           
        quickSortRecursive(data,0,n-1);      
        System.out.println("LISTA ARREGLADA (QuickSort)");
		for(int i = 0; i<data.size(); i++){
			System.out.println(i+"."+data.get(i));
		}
/* Se guarda la lista ya ordenada mediante el m�todo QuickSort en un archivo de texto
 * llamado de la misma manera "QuickSort.txt" en el cual se encuentra la lista llena
 */
		File archivo = new File("QuickSort.txt");
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

    private static void quickSortRecursive(ArrayList<Integer> data,int left,int right)
    // pre: left <= right
    // post: data[left..right] in ascending order
    {
            int pivot; // the final location of the leftmost value
            if (left >= right) return;
            pivot = partition(data,left,right); /* 1 - place pivot */
            quickSortRecursive(data,left,pivot-1); /* 2 - sort small */
            quickSortRecursive(data,pivot+1,right);/* 3 - sort large */
            /* done! */
    }
    public static void swap(ArrayList<Integer> lista,int posIn,int posFinal){
        int temp = lista.get(posIn);
        lista.set(posIn, lista.get(posFinal));
        lista.set(posFinal, temp);
     }   
}

