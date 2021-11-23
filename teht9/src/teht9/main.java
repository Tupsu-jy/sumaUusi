package teht9;

public class main {

	public static void main(String[] args) {
		//SortingAlgorithmIF asd = new
		ArraySorter asd = new ArraySorter(new BubbleSort());
		asd.initializeUnsortedArray(99);
		asd.sort();
		asd.printSortedArray();
		asd.initializeUnsortedArray(9999);
		System.out.println("Time to sort "+asd.sortWithTimer()+"ms");
		
		asd.setAlgo(new SelectionSort());
		asd.initializeUnsortedArray(99);
		asd.sort();
		asd.printSortedArray();
		asd.initializeUnsortedArray(9999);
		System.out.println("Time to sort "+asd.sortWithTimer()+"ms");

		asd.setAlgo(new MergeSort());
		asd.initializeUnsortedArray(99);
		asd.sort();
		asd.printSortedArray();
		asd.initializeUnsortedArray(9999);
		System.out.println("Time to sort "+asd.sortWithTimer()+"ms");
		
	}

}
/**
b) Toteuta vähintään kolme erilaista taulukon lajittelualgoritmia (lähdekoodeja esim. 
https://java2novice.com/java-sorting-algorithms/. Esitä sovellus, jossa lajittelualgoritmin
 valinta toteutetaan Strategy-mallin mukaisesti. Generoi tarpeeksi suuri lajiteltava 
 aineisto ja mittaa lajitteluun kuluvat ajat. 


mainissa tehdään main jutu

se luokka joka sisältää interfacen??
Lajittelija
private algo asd

metodi lajittele(array)
	array =asd.lajittele
	return array
	
metodi lajitteleAika (kutsuu lajittele metodia)
	

lajitteluAlgortimi interface
3kpl algoja jotka toteuttaa sen (kopsataan)


*/