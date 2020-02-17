package vtaras.own.utils.math.bit.counting;

class BitCounting {

    static int countBits(int n) {
        return Integer.bitCount(n);
    }

    static int countBitsLongWay(int n) {
        String binaryNumber = Integer.toBinaryString(n);
        char[] arr = binaryNumber.toCharArray();
        int count = 0;
        for (char c : arr) {
            if (String.valueOf(c).equals("1")) {
                count++;
            }
        }
        return count;
    }
}
