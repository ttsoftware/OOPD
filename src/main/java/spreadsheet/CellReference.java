package spreadsheet;

public class CellReference extends Expression {

    private final Spreadsheet spreadsheet;
    private final Position position;

    public CellReference(final Spreadsheet spreadsheet, final Position position) {
        this.spreadsheet = spreadsheet;
        this.position = position;
    }

    @Override
    public boolean toBoolean() {
        return spreadsheet.get(position).toBoolean();
    }

    @Override
    public int toInt() {
        return spreadsheet.get(position).toInt();
    }

    @Override
    public String toString() {
        return spreadsheet.get(position).toString();
    }
}
