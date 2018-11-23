/**
 * Created by rramwal on 23/11/18.
 */

/**
 * Bubble Sort - Traverse the array from first to array length -1 position and compare the element with the next one.
 * Element is swapped with next element if the next element is greater.
 *
 * Time Complexity -
 *      Best - O(n)
 *      Worst - O(n2)
 */


public class BubbleSort {


    public void sort(Integer[] intArray) {
        int n = intArray.length;
        int temp;


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

    }

}


