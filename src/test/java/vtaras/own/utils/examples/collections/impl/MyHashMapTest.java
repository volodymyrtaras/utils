package vtaras.own.utils.examples.collections.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyHashMapTest {

    private MyHashMap map;

    @Before
    public void setUp() {
        map = new MyHashMap();
    }

    @Test
    public void testGet() {
        map.put(1, 4L);
        map.put(2, 5L);
        map.put(3, 6L);
        assertEquals(4L, (long) map.get(1));
        assertEquals(5L, (long) map.get(2));
        assertEquals(6L, (long) map.get(3));
    }

    @Test
    public void testPutWithDifferentKeys() {
        map.put(1, 2L);
        map.put(2, 2L);
        assertEquals(2, map.size());
    }

    @Test
    public void testPutWithEqualKeys() {
        map.put(1, 2L);
        map.put(1, 2L);
        assertEquals(1, map.size());
    }

    @Test
    public void testResize() {
        map.put(99, 4L);
        map.put(98, 5L);
        map.put(97, 6L);
        map.put(96, 7L);
        map.put(95, 8L);
        map.put(94, 9L);
        map.put(93, 10L);
        map.put(92, 11L);
        map.put(91, 12L);
        map.put(90, 13L);
        map.put(89, 14L);
        map.put(88, 15L);
        map.put(87, 16L);

        //13
        assertEquals(13, map.size());

        map.put(86, 17L);
        map.put(85, 18L);
        map.put(84, 19L);

        // 16
        assertEquals(16, map.size());

        map.put(83, 20L);
        map.put(82, 21L);

        assertEquals(18, map.size());

        assertEquals(21L, (long) map.get(82));
        assertEquals(20L, (long) map.get(83));
        assertEquals(19L, (long) map.get(84));
        assertEquals(18L, (long) map.get(85));
        assertEquals(17L, (long) map.get(86));
    }
}
