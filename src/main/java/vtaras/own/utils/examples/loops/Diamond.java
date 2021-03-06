package vtaras.own.utils.examples.loops;

public class Diamond {

    public static void drawDiamond(int size) {
        drawDiamondUpperPart(size);
        drawBottomPart(size);
    }

    private static void drawDiamondUpperPart(int size) {
        for (int col = 0; col <= size - 1; col++) {
            drawDiamondPart(size, col);
        }
    }

    private static void drawBottomPart(int size) {
        for (int col = size - 2; col >= 0; col--) {
            drawDiamondPart(size, col);
        }
    }

    private static void drawDiamondPart(int size, int col) {
        for (int sp = 0; sp <= size - col; sp++) {
            System.out.print(" ");
        }
        for (int raw = 0; raw <= col; raw++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
