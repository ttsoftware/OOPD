package spreadsheet;

public class Position {

    private final int column;
    private final int row;

    public Position(final int column, final int row) {
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isEqualTo(final Position other) {
        return !(column != other.column || row != other.row);
    }
}
