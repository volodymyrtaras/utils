package vtaras.own.utils.sort.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static vtaras.own.utils.sort.array.SortUtils.bucketSort;

public class SortUtilsTest {
    private int[] mainArray;

    @Before
    public void setUp() throws Exception {
        mainArray = new int[10];
        for (int index = 9; index >= 0; index--) {
            mainArray[index] = index;
        }
    }

    @Test
    public void testSort() {
        bucketSort(mainArray);
        int[] testArray = new int[10];
        for (int index = 0; index < testArray.length; index++) {
            testArray[index] = index;
        }
        Assert.assertArrayEquals(mainArray, testArray);
    }
}