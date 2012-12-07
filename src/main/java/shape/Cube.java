package shape;

public class Cube {

    private final int a;

    public Cube(final int a) {
        this.a = a;
    }

    public int getSurfaceArea() {
        return (int) (6 * Math.pow(a, 2));
    }

    public int getVolume() {
        return (int) Math.pow(a, 3);
    }

    public int getLengthOfFaceDiagonal() {
        return (int) (a * Math.sqrt(2));
    }

    public int getLengthOfSpaceDiagonal() {
        return (int) (a * Math.sqrt(3));
    }
}
