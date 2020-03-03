package vtaras.own.utils.math.counting.cubes;

import org.junit.Assert;
import org.junit.Test;

public class CubesSumTest {

    @Test
    public void test1() {
        Assert.assertEquals(2022, CubesSum.findNumberOfCubes(4183059834009L));
    }

    @Test
    public void test2() {
        Assert.assertEquals(-1, CubesSum.findNumberOfCubes(24723578342962L));
    }

    @Test
    public void test3() {
        Assert.assertEquals(4824, CubesSum.findNumberOfCubes(135440716410000L));
    }

    @Test
    public void test4() {
        Assert.assertEquals(3568, CubesSum.findNumberOfCubes(40539911473216L));
    }
}
