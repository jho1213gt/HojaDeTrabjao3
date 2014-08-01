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

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GNXN000000
 */
public class InsertionSortTest {
    
    public InsertionSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of insertionSort method, of class InsertionSort.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        ArrayList<Integer> data = new ArrayList<Integer> ();
        int n = 0;
        InsertionSort.insertionSort(data, n);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
