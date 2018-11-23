/**
 * Created by rramwal on 23/11/18.
 */

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;



public class BubbleSortTest {
    BubbleSort sorter = new BubbleSort();
    Integer[] input = { 24, 2, 45, 20, 56, 75, 56, 99, 53, 100};

    @Test
    public void sort() {
        Integer[] expected = input.clone();
        Arrays.sort(expected);
        Integer[] actuals = input.clone();
        sorter.sort(actuals);
        Assert.assertArrayEquals(expected,actuals);
    }
}
