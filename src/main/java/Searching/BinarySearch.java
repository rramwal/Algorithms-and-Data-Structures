package Searching;

/**
 * Created by rramwal on 23/11/18.
 */

/* Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array.
 If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 Otherwise narrow it to the upper half.
 */
public class BinarySearch {

    public static boolean contains(Comparable a[], Comparable b) {
        int lowerIndex = 0;
        int upperIndex = a.length - 1;

        while (lowerIndex < upperIndex) {
            int midPoint = (lowerIndex + upperIndex) / 2;
            if (b.compareTo(a[midPoint]) >= 1) {   ///if  (b > a[middle])
                lowerIndex = midPoint + 1;
            } else if (b.compareTo(a[midPoint]) <= -1) { //if (b < a[middle])
                upperIndex = midPoint - 1;
            } else { // The element has been found
                return true;
            }
        }
        return false;

    }
}
