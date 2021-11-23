package teht9;

public class BubbleSort implements SortingAlgorithmIF {

	@Override
	public int[] sort(int[] unsorted) {
        int n = unsorted.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (unsorted[i] > unsorted[k]) {
                    swapNumbers(i, k, unsorted);
                }
            }
        }
        
        return unsorted;
	}

  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
