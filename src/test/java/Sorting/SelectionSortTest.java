package Sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by rramwal on 23/11/18.
 */
public class SelectionSortTest {
    SelectionSort sorter = new SelectionSort();
    Integer[] input = {24, 2, 45, 20, 56, 75, 56, 99, 53, 100};

    @Test
    public void sort() {
        Integer[] expected = input.clone();
        Arrays.sort(expected);
        Integer[] Sorted = input.clone();
        sorter.sort(Sorted);
        Assert.assertArrayEquals(expected, Sorted);
    }
}
