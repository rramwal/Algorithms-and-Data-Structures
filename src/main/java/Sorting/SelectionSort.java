package Sorting;

/**
 * Created by rramwal on 23/11/18.
 */
public class SelectionSort {
    public void sort(Integer[] intArray) {

        for (int i = 0; i < intArray.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[index]) {
                    index = j;
                }
            }
            int smallNumber = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = smallNumber;

        }

    }
}
