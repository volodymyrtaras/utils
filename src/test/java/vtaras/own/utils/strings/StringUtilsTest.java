package vtaras.own.utils.strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StringUtilsTest {

    @Test
    public void testFindAllDuplicatesInString() {
        Map<Character, Integer> firstResultMap = new HashMap<>(3);
        firstResultMap.put('r', 2);
        firstResultMap.put('m', 2);
        firstResultMap.put('g', 2);
        Map<Character, Integer> secondResultMap = new HashMap<>();
        secondResultMap.put('i', 2);
        secondResultMap.put('o', 2);
        secondResultMap.put('n', 2);
        Map<Character, Integer> thirdResultMap = new HashMap<>();
        thirdResultMap.put('a', 2);
        Map<Character, Integer> noDuplicatesMap = new HashMap<>();
        Assert.assertEquals(firstResultMap, StringUtils.findAllDuplicatesInString("Programming"));
        Assert.assertEquals(secondResultMap, StringUtils.findAllDuplicatesInString("Combination"));
        Assert.assertEquals(thirdResultMap, StringUtils.findAllDuplicatesInString("Java"));
        Assert.assertEquals(noDuplicatesMap, StringUtils.findAllDuplicatesInString("Lua"));
    }

    @Test
    public void testIsAnagram() {
        Assert.assertTrue(StringUtils.isAnagram("word", "wrdo"));
        Assert.assertTrue(StringUtils.isAnagram("Mary", "Army"));
        Assert.assertTrue(StringUtils.isAnagram("stop", "tops"));
        Assert.assertFalse(StringUtils.isAnagram("sleep", "slep"));
        Assert.assertFalse(StringUtils.isAnagram("bb", "bbb"));
        Assert.assertTrue(StringUtils.isAnagram("a", "a"));
    }

    @Test
    public void testDecodeAsciiString() {
        Assert.assertEquals("Have a Nice Day ",
                StringUtils.decodeAsciiString("2312179862310199501872379231018117927"));
        Assert.assertEquals("Truth Always Wins ",
                StringUtils.decodeAsciiString("23511011501782351112179911801562340161171141148"));
    }

    @Test
    public void testFindFirstNonRepeatedChar() {
        Assert.assertNull(StringUtils.findFirstRepeatedChar("Acer"));
        Assert.assertEquals(Character.valueOf('s'), StringUtils.findFirstRepeatedChar("Asus"));
        Assert.assertEquals(Character.valueOf('o'), StringUtils.findFirstRepeatedChar("Volodymyr"));
    }

    @Test
    public void testReverseStringRecursively() {
        Assert.assertEquals("A", StringUtils.reverseStringRecursively("A"));
        Assert.assertEquals("shot", StringUtils.reverseStringRecursively("tohs"));
        Assert.assertEquals("azOr", StringUtils.reverseStringRecursively("rOza"));
    }

    @Test
    public void testStringHasOnlyNumbers() {
        Assert.assertTrue(StringUtils.isStringContainsOnlyNumbers("123"));
        Assert.assertTrue(StringUtils.isStringContainsOnlyNumbers("1a3"));
        Assert.assertTrue(StringUtils.isStringContainsOnlyNumbers("aaas"));
    }

    @Test
    public void testVowelsCount() {
        Assert.assertEquals(1, StringUtils.vowelsCount("Mommy"));
        Assert.assertEquals(1, StringUtils.vowelsCount("Dad"));
        Assert.assertEquals(2, StringUtils.vowelsCount("Sister"));
    }

    @Test
    public void testCountOfSymbolOccurrences() {
        Assert.assertEquals(3, StringUtils.countOfSymbolOccurrences('m', "Mommy"));
        Assert.assertEquals(2, StringUtils.countOfSymbolOccurrences('d', "Dad"));
        Assert.assertEquals(2, StringUtils.countOfSymbolOccurrences('s', "Sister"));
    }

    @Test
    public void testIsStringPalindrome() {
        Assert.assertTrue(StringUtils.isPalindrome("akka"));
        Assert.assertTrue(StringUtils.isPalindrome("Anna"));
        Assert.assertTrue(StringUtils.isPalindrome("waaw"));
        Assert.assertFalse(StringUtils.isPalindrome("akia"));
    }

    @Test
    public void testCheckBracketsOrder() {
        Assert.assertTrue(StringUtils.checkBracketsOrder(""));
        Assert.assertTrue(StringUtils.checkBracketsOrder("({[]})"));
        Assert.assertTrue(StringUtils.checkBracketsOrder("{a(b{c[d]e}f)g}h"));
        Assert.assertFalse(StringUtils.checkBracketsOrder("({(]})"));
        Assert.assertFalse(StringUtils.checkBracketsOrder("{{f)"));
        Assert.assertFalse(StringUtils.checkBracketsOrder("({a(b{c[d]e}f)g}h"));
    }
}
