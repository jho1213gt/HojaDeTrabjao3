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

public class InsertionSort {
    public static void insertionSort(ArrayList<Integer> data, int n){        
        
    int numSorted = 1; // number of values in place
    int index; // general index
    while (numSorted < n){
        // take the first unsorted value
        int temp = data.get(numSorted);
        // ...and insert it among the sorted:
        for (index = numSorted; index > 0; index--){
            if (temp < data.get(index-1)){
            data.set(index, data.get(index-1));
        } 
            else{                     
        break;

        }
    }
        // reinsert value
        data.set(index, temp);
        numSorted++;    

    }
    System.out.println("LISTA ARREGLADA (InsertionSort)");
		for(int i = 0; i<data.size(); i++){
			System.out.println(i+"."+data.get(i));
		}
		File archivo = new File("InsertionSort.txt");
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
    
}
