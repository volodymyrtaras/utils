package vtaras.own.utils.math;

public class Fibonacci {
    public static int getFibonacciNumber(int number) {
        return number < 2 ? number : getFibonacciNumber(number - 2) + getFibonacciNumber(number - 1);
    }
}
