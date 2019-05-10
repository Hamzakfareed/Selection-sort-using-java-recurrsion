package sort;

public class SortUtils {

	// sort method which accpet array as parameter
	public static <T extends Comparable<T>> void recursiveSelectionSort(final T[] array) {
		// call to sort method , pass array , first index of array which is
		// always 0 , array length -1
		recursiveSelectionSort(array, 0, array.length - 1);

	}

	// sort method which accept list , minimun index value and high indexValue
	public static <T extends Comparable<T>> void recursiveSelectionSort(final T[] array, final int min, final int high) {
		// if low is less than high , which mean the 0 < array length , its mean
		// if we have some data in list
		if (min < high) {
			// indexOfMin will be equal to low
			int indexOfMin = min;
			// min value will be equal to the first value in list
			T minimum = array[min];
			// start loop from second postion in list to the last position in
			// list
			for (int search = min + 1; search <= high; search++) {
				// check if the i position value is list than min value or not ,
				// if it is
				if (array[search].compareTo(minimum) < 0) {
					// min value will be the i value in list
					minimum = array[search];
					// indexOfMin will be equal to the min value index which i
					indexOfMin = search;
				}
			}

			// Swap the smallest number in list
			array[indexOfMin] = array[min];
			array[min] = minimum;

			// Sort the remaining list
			recursiveSelectionSort(array, min + 1, high);

		}
	}
}