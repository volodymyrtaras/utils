package vtaras.own.utils.math;

public class Power {
    public static int powerNumber(int num, int degree) {
        int result = num;
        for (int i = 0; i < degree - 1; i++) {
            result *= num;
        }
        return result;
    }
}
