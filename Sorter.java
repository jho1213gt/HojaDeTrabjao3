public static void insertionSort (Comparable[] lista){
      for (int index = 1; index < lista.length; index++){
         Comparable key = lista[index];
         int position = index;
         //  Shift larger values to the right
         while (position > 0 && key.compareTo(lista[position-1]) < 0){
            lista[position] = lista[position-1];
            position--;
         } 
         lista[position] = key;
      }
   }

/**
 * InsertionSort
 * Referenciado del libro: Java Structures, de Duane A. Bailey
 */
public static void insertionSort(int data[], int n){
// pre: 0 <= n <= data.length
// post: values in data[0..n-1] are in ascending order

    int numSorted = 2000; // number of values in place
    int lista; // general index
    while (numSorted < n){
        // take the first unsorted value
        int temp = data[numSorted];
        // ...and insert it among the sorted:
        for (lista = numSorted; lista > 0; lista--){
            if (temp < data[lista-1]){
            data[lista] = data[lista-1];
        } 
            else{
        break;
        }
    }
        // reinsert value
        data[lista] = temp;
        numSorted++;
    }
}

}    
