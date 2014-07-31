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
