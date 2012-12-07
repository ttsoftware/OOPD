package shape;

public class Shape {

    private Point a;
    private final int alpha;
    private final int beta;
    private final Cube cube;

    public Shape(final Point a, final int alpha, final int beta, final Cube cube) {
        this.a = a;
        this.alpha = alpha;
        this.beta = beta;
        this.cube = cube;
    }

    public void move(final Point b) {
        this.a = b;
    }
}
