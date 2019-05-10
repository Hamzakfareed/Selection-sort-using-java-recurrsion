package main;

import sort.SortUtils;

public class Main {

	public static void main(String[] args) {
		Integer[] sortingList = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		String[] list = { "d", "c", "g", "a", "b" };
		// selectionSort.sort(sortingList);
		SortUtils.recursiveSelectionSort(sortingList);
		SortUtils.recursiveSelectionSort(list);
		// recursion completed now print sorted array
		/*recurSelectionSort(sortingList,sortingList.length,0);
		recurSelectionSort(list,list.length,0);*/
		for (int i = 0; i < sortingList.length; i++)
			System.out.println("sorted list is : " + sortingList[i]);
		
		System.out.println("=======================================");
		for (int i = 0; i < list.length; i++)
			System.out.println("sorted list is : " + list[i]);
	}

	/*static<T extends Comparable<T>> int minIndex(T array[], int i, int j) 
    { 
        if (i == j) 
            return i; 
       
        // Find minimum of remaining elements 
        int k = minIndex(array, i + 1, j); 
       
        // Return minimum of current and remaining. 
        return ((array[i].compareTo(array[k]))<0)? i : k; 
    } 
       
    // Recursive selection sort. n is size of a[] and index 
    // is index of starting element. 
    static <T extends Comparable<T>> void recurSelectionSort(T array[], int size, int index) 
    { 
           
        // Return when starting and size are same 
        if (index == size) 
           return; 
       
        // calling minimum index function for minimum index 
        int k = minIndex(array, index, size-1); 
       
        // Swapping when index nd minimum index are not same 
        if (k != index){ 
           // swap 
           T temp = array[k]; 
           array[k] = array[index]; 
           array[index] = temp; 
        } 
        // Recursively calling selection sort function 
        recurSelectionSort(array, size, index + 1); 
    } */
}