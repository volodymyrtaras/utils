package vtaras.own.utils.math;

public class Factorial {
    public static int getFactorialForNumber(int number) {
        return ((number == 1) || (number == 0)) ? 1 : (number * getFactorialForNumber(number - 1));
    }
}
