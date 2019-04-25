package jp.ac.titech.itpro.sdl.hilbert;

public class Turtle {
    public interface Drawer {
        void drawLine(double x0, double y0, double x1, double y1);
    }

    public static final int R = 1, L = -1;
    public static final int N = 0, E = 1, S = 2, W = 3;
    public static final int[] pseudoSin = {0, 1, 0, -1};
    public static final int[] pseudoCos = {1, 0, -1, 0};

    private double x = 0.0, y = 0.0;
    private int dir = 0;

    private Drawer drawer;

    public Turtle(Drawer drawer) {
        this.drawer = drawer;
    }

    public void setPos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void forward(double step) {
        double x1 = x + pseudoSin[dir] * step;
        double y1 = y - pseudoCos[dir] * step;
        drawer.drawLine(x, y, x1, y1);
        x = x1;
        y = y1;
    }

    public void rotate(int th) {
        dir = (dir + th + 4) % 4;
    }
}
