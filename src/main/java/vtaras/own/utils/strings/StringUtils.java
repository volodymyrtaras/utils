package vtaras.own.utils.strings;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class StringUtils {

    /*
     *  returns map of duplicate characters and their count
     *  if no duplicates found, returns empty map
     */
    public static Map<Character, Integer> findAllDuplicatesInString(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        Map<Character, Integer> map = new ConcurrentHashMap<>();
        for (Character c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= 1) {
                map.remove(entry.getKey());
            }
        }
        return map;
    }

    /*
     * returns true, if given strings are anagrams
     */
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    /*
     * returns reversed decoded String
     */
    public static String decodeAsciiString(String encoded) {
        StringBuilder decoded = new StringBuilder();
        encoded = new StringBuilder(encoded).reverse().toString();
        int num = 0;
        for (int i = 0; i < encoded.length(); i++) {
            num = num * 10 + (encoded.charAt(i) - '0');
            if (num >= 32 && num <= 122) {
                char c = (char) num;
                decoded.append(c);
                num = 0;
            }
        }
        return decoded.toString();
    }

    /*
     * returns first char in word which is repeated
     * if no duplicate found, return null
     */
    public static Character findFirstNonRepeatedChar(String s) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return null;
    }

    /*
     * reverses a string using recursion
     */
    public static String reverseStringRecursively(String s) {
        if (s.length() < 2) {
            return s;
        }
        return reverseStringRecursively(s.substring(1)) + s.charAt(0);
    }

    /*
     * returns true, if string has only numbers
     */
    public static boolean isStringContainsOnlyNumbers(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars) {
            int i = Character.getNumericValue(c);
            if (i < 0 && i > 9) {
                return false;
            }
        }
        return true;
    }

    /*
     * returns count of vowels in given word
     */
    public static int vowelsCount(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }
        }
        return count;
    }

    /*
     * returns count of symbol occurrences in given string
     */
    public static int countOfSymbolOccurrences(Character character, String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int count = 0;
        for (char c : chars) {
            if (character.equals(c)) {
                count++;
            }
        }
        return count;
    }

    /*
     * returns true if given string is palindrome
     */
    public static boolean isPalindrome(String s) {
        return new StringBuilder(s.toLowerCase()).reverse().toString().equals(s.toLowerCase());
    }
}
