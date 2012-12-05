package spreadsheet;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 11/21/12
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Position {

    private final int column;
    private final int row;

    public Position(final int column, final int row) {

        this.column = column;
        this.row = row;
    }

    public boolean isEqualTo(final Position other) {
        return (other.getColumn() == getColumn()) && (other.getRow() == getRow());
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}