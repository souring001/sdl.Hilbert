package jp.ac.titech.itpro.sdl.hilbert;

public class HilbertTurtle extends Turtle {

    public HilbertTurtle(Drawer drawer) {
        super(drawer);
    }

    public void draw(int original_order, int order, double step, int turn) {
        if(order == original_order){
            rotate(-turn);
            draw(original_order, order - 1, step, -turn);
            forward2(step);
            rotate(turn);
            draw(original_order,order - 1, step, turn);
            forward2(step);
        }else if (order > 0) {
            rotate(-turn);
            draw(original_order, order - 1, step, -turn);
            forward2(step);
            rotate(turn);
            draw(original_order,order - 1, step, turn);
            forward2(step);
            draw(original_order,order - 1, step, turn);
            rotate(turn);
            forward2(step);
            draw(original_order,order - 1, step, -turn);
            rotate(-turn);
        }
    }
}
