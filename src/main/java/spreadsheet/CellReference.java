package spreadsheet;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class CellReference extends Expression {

    private final Spreadsheet spreadsheet;
    private final Position key;
    private final Expression value;

    public CellReference(final Spreadsheet spreadsheet, final Position key) {
        this.spreadsheet = spreadsheet;
        this.key = key;
        this.value = spreadsheet.get(key);
    }

    @Override
    public boolean toBoolean() {
        return value.toBoolean();
    }

    @Override
    public int toInt() {
        return value.toInt();
    }

    @Override
    public String getValue() {
        return value.getValue();
    }

    public Spreadsheet getSpreadsheet() {
        return spreadsheet;
    }

    public Position getKey() {
        return key;
    }
}
