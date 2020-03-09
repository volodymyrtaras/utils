package vtaras.own.utils.math;

public class ChangeVariableValues {
    public static void main(String[] args) {
        int x = 11;
        int y = 12;
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int i = 5;
        int j = 10;
        i = i + j;
        j = i - j;
        i = i - j;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        int m = 2;
        int n = 3;
        n = n ^ m;
        m = n ^ m;
        n = n ^ m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }
}
