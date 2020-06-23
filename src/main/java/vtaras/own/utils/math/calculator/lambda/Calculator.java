package vtaras.own.utils.math.calculator.lambda;

import java.util.HashMap;
import java.util.function.BinaryOperator;

public class Calculator {
    private static HashMap<Character, BinaryOperator<Double>> operations;

    public Calculator() {
        operations = addOperations();
    }

    private static HashMap<Character, BinaryOperator<Double>> addOperations() {
        HashMap<Character, BinaryOperator<Double>> operations = new HashMap<>();
        operations.put('+', Double::sum);
        operations.put('-', (x, y) -> x - y);
        operations.put('*', (x, y) -> x * y);
        operations.put('/', (x, y) -> x / y);
        operations.put('#', (x, y) -> Math.pow(x, 1.0 / y));
        operations.put('^', Math::pow);
        operations.put('$', (x, y) -> Math.pow((x + y) / x + 117, y));
        return operations;
    }

    public static double calculate(double x, char c, double y) {
        BinaryOperator<Double> action = operations.get(c);
        return action.apply(x, y);
    }
}
