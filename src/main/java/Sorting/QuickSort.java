package Sorting;

/**
 * Created by rramwal on 23/11/18.
 */
public class QuickSort {

    private Integer array[];
    private int length;

    public void sort(Integer[] intArray) {
        this.array = intArray;
        length = intArray.length - 1;
        quicksort(0, length);
    }

    private void quicksort(int lowerIndex, int upperIndex) {
        int i = lowerIndex;
        int j = upperIndex;

        //calculate midpoint or a mid index number
        int midPoint = array[lowerIndex + (upperIndex - lowerIndex) / 2];

        //spilt into two arrays
        while (i <= j) {
            /*
            identify a number from left bound which is greater than midpoint and
            identify a number from right bound which is lesser than midpoint and then swap.
             */

            while (array[i] < midPoint) {
                i++;
            }

            while (array[j] > midPoint) {
                j--;
            }

            if (i <= j) {
                SwapNumbers(i, j);
                i++;
                j--;
            }

        }
        //call this method recursively

        if (lowerIndex < j) {
            quicksort(lowerIndex, j);
        }
        if (i < upperIndex) {
            quicksort(i, upperIndex);
        }

    }

    private void SwapNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
