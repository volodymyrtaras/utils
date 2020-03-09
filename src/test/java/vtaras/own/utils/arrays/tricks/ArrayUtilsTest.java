package vtaras.own.utils.arrays.tricks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ArrayUtilsTest {

    //data for testing ArrayTricks.findFirstMissedInteger method
    private static int[] cleanArr;
    private static int[] oneIntegerMissedArr;

    private static int missedValue = 10;

    //data for testing ArrayTricks.findDuplicatesInArrayOfIntegers() method
    private static int[] firstDuplicateArr = new int[]{0, 1, 1, 2};
    private static int[] secondDuplicateArr = new int[]{0, 0, 1, 1, 2, 2};
    private static int[] thirdDuplicateArr = new int[]{1, 1, 1, 2, 2, 2, 3};

    private static int[][] firstDuplicateArrResult = new int[][]{{1, 1}};
    private static int[][] secondDuplicateArrResult = new int[][]{{0, 1}, {1, 1}, {2, 1}};
    private static int[][] thirdDuplicateArrResult = new int[][]{{1, 2}, {2, 2}};

    @Before
    public void setUp() {
        cleanArr = new int[100];
        for (int i = 0; i < cleanArr.length; i++) {
            cleanArr[i] = i;
        }
        oneIntegerMissedArr = new int[cleanArr.length - 1];
        for (int i = 0, j = 0; i < oneIntegerMissedArr.length; i++, j++) {
            oneIntegerMissedArr[i] = cleanArr[j];
            if (cleanArr[i] == missedValue) {
                oneIntegerMissedArr[i] = cleanArr[++j];
            }
        }
    }

    @Test
    public void testFindFirstMissedInteger() {
        Assert.assertEquals(0, ArrayUtils.findFirstMissedInteger(cleanArr));
        Assert.assertEquals(missedValue, ArrayUtils.findFirstMissedInteger(oneIntegerMissedArr));
    }

    @Test
    public void testFindDuplicatesInArrayOfIntegers() {
        Assert.
                assertTrue(Arrays
                        .deepEquals(firstDuplicateArrResult, ArrayUtils
                                .findDuplicatesInArrayOfIntegers(firstDuplicateArr)));
        Assert.
                assertTrue(Arrays
                        .deepEquals(secondDuplicateArrResult, ArrayUtils
                                .findDuplicatesInArrayOfIntegers(secondDuplicateArr)));
        Assert
                .assertTrue(Arrays
                        .deepEquals(thirdDuplicateArrResult, ArrayUtils
                                .findDuplicatesInArrayOfIntegers(thirdDuplicateArr)));
    }
}
