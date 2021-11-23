package teht9;

public class SelectionSort implements SortingAlgorithmIF {

	@Override
	public int[] sort(int[] unsorted) {

        for (int i = 0; i < unsorted.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < unsorted.length; j++)
                if (unsorted[j] < unsorted[index]) 
                    index = j;
      
            int smallerNumber = unsorted[index];  
            unsorted[index] = unsorted[i];
            unsorted[i] = smallerNumber;
        }
        return unsorted;
	}

}
