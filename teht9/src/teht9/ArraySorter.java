package teht9;

import java.util.Random;

public class ArraySorter {

	private SortingAlgorithmIF algo;
	private int[] unsortedArray;
	private int[] lastSortedArray;
	
	public ArraySorter(SortingAlgorithmIF initAlgo) {
		this.algo = initAlgo;
	}
	
	public void sort() {
		lastSortedArray = algo.sort(unsortedArray);
	}

	public int sortWithTimer() {
		long before = System.currentTimeMillis();
		this.sort();
		return (int) (System.currentTimeMillis()-before);
	}

	public void initializeUnsortedArray(int size){
		Random rd = new Random(); // creating Random object
		unsortedArray = new int[size];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = rd.nextInt(); // storing random integers in an array
		}
	}

	public int[] getLastSortedArray() {
		return lastSortedArray;
	}
	
	public void setAlgo(SortingAlgorithmIF newAlgo) {
		this.algo = newAlgo;
	}
	
	public void printSortedArray() {
		for (int i = 0; i < lastSortedArray.length; i++) {
			if(i % 10 != 0) {
				System.out.print(lastSortedArray[i]+",");
			}else {
				System.out.println(lastSortedArray[i]);
			}
		}
		System.out.println();
	}
}

/*
private algo asd
private int[] array

metodi lajittele(array)
	array =asd.lajittele
	return array
	
metodi lajitteleAika (kutsuu lajittele metodia)
	
	
metodi resetArry

metdoti printArrty
*/