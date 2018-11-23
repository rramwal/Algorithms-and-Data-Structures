package Searching;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by rramwal on 23/11/18.
 */
public class BinarySearchTest {

    @Test
    public void SearchingTest() {
        Integer[] a = {1, 2, 3, 4, 11, 17, 27, 39};

        assertTrue(BinarySearch.contains(a, 17));
        assertTrue(BinarySearch.contains(a, 27));
        assertFalse(BinarySearch.contains(a, 899));
        assertFalse(BinarySearch.contains(a, 19));
    }
}
