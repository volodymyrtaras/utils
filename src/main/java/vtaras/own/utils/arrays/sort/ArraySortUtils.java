package vtaras.own.utils.arrays.sort;

/*
 *****TOP FIVE*****
 * Bucket Sort - 100ms
 * Quick Sort - 236ms
 * Radix Sort - 73543ms
 * Bubble Sort - 1341086ms
 * Insertion Sort - 1473725ms
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortUtils {

    public static int[] bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int x = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = x;
                }
            }
        }
        return numbers;
    }

    public static int[] insertionSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int x = numbers[i];
            int j = i - 1;
            while (j >= 0 && x < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = x;
        }
        return numbers;
    }

    public static int[] bucketSort(int[] numbers) {
        int[] array = new int[numbers.length + 1];
        Arrays.fill(array, 0);
        for (int number : numbers) {
            array[number]++;
        }
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                numbers[x++] = i;
            }
        }
        return numbers;
    }

    public static int[] radixSort(int[] numbers) {
        List<Integer>[] list = new ArrayList[numbers.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }
        boolean bool = false;
        int x;
        int divisor = 1;
        while (!bool) {
            bool = true;
            for (Integer i : numbers) {
                x = i / divisor;
                list[x % numbers.length].add(i);
                if (bool && x > 0) {
                    bool = false;
                }
            }
            int y = 0;
            for (int j = 0; j < numbers.length; j++) {
                for (Integer i : list[j]) {
                    numbers[y++] = i;
                }
                list[j].clear();
            }
            divisor *= 10;
        }
        return numbers;
    }

    public static int[] quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int x = partition(numbers, low, high);
            quickSort(numbers, low, x - 1);
            quickSort(numbers, x + 1, high);
        }
        return numbers;
    }

    private static int partition(int[] numbers, int low, int high) {
        int y = numbers[low];
        int i = low;
        for (int j = low + 1; j <= high; j++)
            if (numbers[j] < y) {
                ++i;
                swap(numbers, i, j);
            }
        swap(numbers, low, i);
        return i;
    }

    private static void swap(int[] numbers, int i, int j) {
        int x = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = x;
    }
}
