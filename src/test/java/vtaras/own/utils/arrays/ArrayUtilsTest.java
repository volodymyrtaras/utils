package vtaras.own.utils.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtilsTest {

    private static int[] firstDuplicateArr = new int[]{0, 1, 1, 2};
    private static int[] secondDuplicateArr = new int[]{0, 0, 1, 1, 2, 2};
    private static int[] thirdDuplicateArr = new int[]{1, 1, 1, 2, 2, 2, 3};

    @Test
    public void testFindFirstMissedInteger() {
        int[] cleanArr = new int[100];
        for (int i = 0; i < cleanArr.length; i++) {
            cleanArr[i] = i;
        }
        int[] oneIntegerMissedArr = new int[cleanArr.length - 1];
        int missedValue = 10;
        for (int i = 0, j = 0; i < oneIntegerMissedArr.length; i++, j++) {
            oneIntegerMissedArr[i] = cleanArr[j];
            if (cleanArr[i] == missedValue) {
                oneIntegerMissedArr[i] = cleanArr[++j];
            }
        }
        Assert.assertEquals(0, ArrayUtils.findFirstMissedArrayElement(cleanArr));
        Assert.assertEquals(missedValue, ArrayUtils.findFirstMissedArrayElement(oneIntegerMissedArr));
    }

    @Test
    public void testFindDuplicatesInArrayOfIntegers() {
        int[][] firstDuplicateArrResult = new int[][]{{1, 1}};
        int[][] secondDuplicateArrResult = new int[][]{{0, 1}, {1, 1}, {2, 1}};
        int[][] thirdDuplicateArrResult = new int[][]{{1, 2}, {2, 2}};
        Assert.
                assertTrue(Arrays
                        .deepEquals(firstDuplicateArrResult, ArrayUtils
                                .findDuplicates(firstDuplicateArr)));
        Assert.
                assertTrue(Arrays
                        .deepEquals(secondDuplicateArrResult, ArrayUtils
                                .findDuplicates(secondDuplicateArr)));
        Assert
                .assertTrue(Arrays
                        .deepEquals(thirdDuplicateArrResult, ArrayUtils
                                .findDuplicates(thirdDuplicateArr)));
    }

    @Test
    public void testRemoveDuplicates() {
        int[] firstResultArr = new int[] {0, 1, 2};
        int[] secondResultArr = new int[] {0, 1, 2};
        int[] thirdResultArr = new int[] {0, 1, 2, 3};
        Assert.assertArrayEquals(firstResultArr, ArrayUtils.removeDuplicates(firstDuplicateArr));
        Assert.assertArrayEquals(secondResultArr, ArrayUtils.removeDuplicates(secondDuplicateArr));
        Assert.assertArrayEquals(thirdResultArr, ArrayUtils.removeDuplicates(thirdDuplicateArr));
    }

    @Test
    public void testFindAllPairsWhoseSumIsAsGiven() {
        int[] firstDataArr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] secondDataArr = new int[]{10, 20, 20, 30};
        Map<Integer, Integer> firstResultMap = new HashMap<>();
        firstResultMap.put(1, 4);
        firstResultMap.put(2, 3);
        Map<Integer, Integer> secondResultMap = new HashMap<>();
        secondResultMap.put(10, 30);
        secondResultMap.put(20, 20);
        Assert.assertEquals(firstResultMap, ArrayUtils.findAllPairsWhoseSumIsAsGiven(firstDataArr, 5));
        Assert.assertEquals(secondResultMap, ArrayUtils.findAllPairsWhoseSumIsAsGiven(secondDataArr, 40));
    }
}
