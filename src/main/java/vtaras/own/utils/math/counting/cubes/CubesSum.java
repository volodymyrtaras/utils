package vtaras.own.utils.math.counting.cubes;

/*
 * Task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3,
 * the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
 *
 * Given the total volume m of the building.
 * Being given m need you find the number n of cubes will have to build.
 *
 * The parameter of the function findNb (find_nb, find-nb, findNb) will be a long m and you have to return
 * the long n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
 */

class CubesSum {
    static long findNumberOfCubes(long m) {
        double count = 0;
        int i;

        for (i = 0; count < m; i++) {
            count = Math.pow(i * (i + 1), 2) / 4;
        }

        if (count == i) {
            return i - 1;
        } else {
            return -1;
        }
    }
}
