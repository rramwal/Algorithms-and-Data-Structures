package Sorting;

/**
 * Created by rramwal on 23/11/18.
 */

/*
*Insertion sort is a simple sorting algorithm in which sorting is done by picking one array element at a time
* and inserting it into already sorted subarray.
* Time Complexity :
*       Best : O(n)
*       Worst : O(n2)
*       Big difference between bubble and insertion will be when the array is already sorted it performs well.
*/
public class InsertionSort {

    public void sort(Integer[] intArray) {
        int j, newValue;
        for (int i = 1; i < intArray.length; i++) {
            newValue = intArray[i];
            j = i;
            while (j > 0 && intArray[j - 1] > newValue) {
                intArray[j] = intArray[j - 1];
                j--;
            }
            intArray[j] = newValue;

        }

    }

}

