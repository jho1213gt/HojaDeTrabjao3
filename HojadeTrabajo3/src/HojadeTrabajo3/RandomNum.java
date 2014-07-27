package HojadeTrabajo3;
import java.io.*;
import java.util.*;
public class RandomNum {
/*
 * Variables para la creación del número Random
 */
	private int contador;
	static Comparable [] comp;
	
	public void numeroRandom(){
		contador = 5;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		ArrayList<Integer> arreglado = new ArrayList<Integer>();
		
/*
 * Ciclo para que siga generando números random y los va guardando
 * en el ArrayList del programa
 * Se crean las variables que utilizamos para la elaboración
 * del número random y especificamos el intervalo en el que 
 * se encontraran los números randoms
*/
		comp = new Comparable[contador];
		for(int i = 0; i < contador; i++){
			int numT = (int)(Math.random()*(10000-100))+100;
			System.out.println(numT);
			numeros.add(numT);
			comp[i] = new Integer (numT);
		}
/*
 * Se cargan los archivos (escriben) en el archivo de texto original (random)
 * para luego en otro archivo ya guardarlos ordenados
 */
		System.out.println("----------------");
		escribir(numeros);
/*
 * Se crea la nueva variable comparable que se utilizara en el bubble sort
 */
		//comp = new Comparable[contador];
		BubbleSort(comp, contador);
		escribir1(numeros);
	}
/*
 * Metodo utilizado para la creación del archivo de texto donde se guardaran los
 * numeros random generados, se iran agregando en cada posición utilizando el
 * ArrayList creado antes para que queden escritos un numero en cada linea
 */
	public void escribir(ArrayList<Integer> lista){
		File archivo = new File("Archivo.txt");
		try{
			FileWriter lector = new FileWriter(archivo);
			BufferedWriter memoria = new BufferedWriter(lector);
			PrintWriter escribir = new PrintWriter(memoria);
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
/*
 * Metodo para generar el nuevo archivo de texto donde se guardaran
 * ya los numeros ordenados de manera ascendente
 */
	public void escribir1(ArrayList<Integer> lista){
		File archivo = new File("Archivo1.txt");
		try{
			FileWriter lector = new FileWriter(archivo);
			BufferedWriter memoria = new BufferedWriter(lector);
			PrintWriter escribir = new PrintWriter(memoria);
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
/*
 * BubbleSort utilizado para ordenar los números del archivo de texto que se trabajo
 * de manera ascendente para luego cargarlo en otro archivo de texto ya de manera
 * ordenada.
 */
	public static void BubbleSort(Comparable[] lista, int num){
		boolean bandera = false;
		while(!bandera){
			bandera = true;
			for(int i = 0; i<num-1;i++){
				if(lista[i].compareTo(lista[i+1])>0){
					Comparable cambio = lista[i+1];
					lista[i+1] = lista[i];
					lista[i] = cambio;
					bandera = false;
					System.out.println("NO ERROR");
				}
			}
			num--;
		}
	}
}
