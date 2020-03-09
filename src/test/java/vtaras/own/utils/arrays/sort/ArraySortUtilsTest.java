package vtaras.own.utils.arrays.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraySortUtilsTest {
    private int[] mainArray = new int[]{1, 2, 3, 5, 4, 6, 7, 8, 11, 223, 32, 23, 4, 0, 53, 5, 53, 77, -1, -20, 1000};

    @Test
    public void testAllSortMethods() {
        int[] testArray = mainArray;
        Arrays.sort(mainArray);
        Assert.assertArrayEquals(mainArray, ArraySortUtils.bubbleSort(testArray));
        Assert.assertArrayEquals(mainArray, ArraySortUtils.insertionSort(testArray));
    }
}
