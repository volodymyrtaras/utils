package vtaras.own.utils.arrays;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ArrayUtils {

    //returns first missed integer in sorted array
    public static int findFirstMissedInteger(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                continue;
            }
            if (arr[i] + 1 != arr[i + 1]) {
                return ++arr[i];
            }
        }
        return 0;
    }

    //returns array of duplicate numbers and their count
    public static int[][] findDuplicatesInArrayOfIntegers(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> resultMap = new HashMap<>(100);
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                break;
            }
            if (arr[i] == arr[i + 1]) {
                if (resultMap.containsKey(arr[i])) {
                    int count = resultMap.get(arr[i]);
                    resultMap.put(arr[i], ++count);
                    continue;
                }
                resultMap.put(arr[i], 1);
            }
        }
        return convertMapOfIntegersToArray(resultMap);
    }

    //converts map of integers to 2D array
    public static int[][] convertMapOfIntegersToArray(Map<Integer, Integer> map) {
        int i = 0;
        int[][] resultArr = new int[map.size()][2];
        for (Map.Entry<Integer, Integer> mapping : map.entrySet()) {
            resultArr[i][0] = mapping.getKey();
            resultArr[i][1] = mapping.getValue();
            i++;
        }
        return resultArr;
    }

    //converts list of integers to array
    public static int[] convertListOfIntegersToArray(List<Integer> list) {
        int[] resultArr = new int[list.size()];
        int index = 0;
        for (Integer i : list) {
            resultArr[index] = i;
            index++;
        }
        return resultArr;
    }
}
