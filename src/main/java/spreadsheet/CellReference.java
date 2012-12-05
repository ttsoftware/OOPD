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
    private final Position position;


    public CellReference(final Spreadsheet spreadsheet, final Position position) {
        this.spreadsheet = spreadsheet;
        this.position = position;
    }

    @Override
    public boolean toBoolean() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int toInt() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getValue() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Spreadsheet getSpreadsheet() {
        return spreadsheet;
    }

    public Position getPosition() {
        return position;
    }
}
