package Searching;

/**
 * Created by rramwal on 23/11/18.
 */

import java.util.Objects;

public class LinearSearch {
    public static boolean contains(Comparable[] a, Comparable b) {
        for (Comparable i : a) {
            if (Objects.equals(i, b)) {
                return true;

            }

        }
        return false;
    }
}
