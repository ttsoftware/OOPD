package spreadsheet;

import quickcheck.Info;

public class PositionInfo extends Info<Position> {

    private final int column, row;

    public PositionInfo(final Position position, final int column, final int row) {
        super(position);
        this.column = column;
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return String.format("new Position(%d, %d)", this.column, this.row);
    }
}
