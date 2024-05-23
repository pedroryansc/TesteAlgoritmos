package testeAlgoritmos;

import java.util.ArrayList;
import java.util.Hashtable;

public class ComparacaoAlgoritmos {
	public static void main(String[] args) {
		
		int SIZE = 10000000;
		
		// Teste com array
		
		long inicio, fim;
		double tempoExecucao;
		
		// Inserção em array
		
		int array[] = new int[SIZE];
		inicio = System.nanoTime();
		
		for(int i = 0; i < SIZE; i++)
			array[i] = (int) (Math.random() * SIZE);

		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println("Tempo de inserção no array: " + tempoExecucao + " ms");
		
		// Busca em array
		
		int searchElement = -1;
		inicio = System.nanoTime();
		
		for(int i = 0; i < SIZE; i++) {
			if(array[i] == searchElement)
				break;
		}
		
		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println("Tempo de busca no array: " + tempoExecucao + " ms");
		
		// Teste com ArrayList
		
		ArrayList<Integer> arrayList = new ArrayList<>(SIZE);
		
		// Inserção em ArrayList
		
		inicio = System.nanoTime();
		
		for(int i = 0; i < SIZE; i++)
			arrayList.add((int) (Math.random() * SIZE));
		
		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println();
		System.out.println("Tempo de inserção no ArrayList: " + tempoExecucao + " ms");
		
		// Busca em ArrayList
		
		inicio = System.nanoTime();
		
		arrayList.contains(searchElement);
		
		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println("Tempo de busca no ArrayList: " + tempoExecucao + " ms");
		
		// Teste com HashTable
		
		Hashtable<Integer, Integer> hashTable = new Hashtable<>(SIZE);
		
		// Inserção em HashTable
		
		for(int i = 0; i < SIZE; i++)
			hashTable.put(i, i);
		
		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println();
		System.out.println("Tempo de inserção na HashTable: " + tempoExecucao + " ms");
		
		// Busca em HashTable
		
		inicio = System.nanoTime();
		
		hashTable.containsKey(searchElement);
		
		fim = System.nanoTime();
		tempoExecucao = (fim - inicio) / 1000000.0;
		
		System.out.println("Tempo de busca na HashTable: " + tempoExecucao + " ms");
		
	}
}