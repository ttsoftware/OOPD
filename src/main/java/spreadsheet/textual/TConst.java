package spreadsheet.textual;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class TConst extends Expression {

    private final String string;

    public TConst(final String string) {
        this.string = string;
    }

    @Override
    public boolean toBoolean() {
        return string.length() > 0;
    }

    @Override
    public int toInt() {
        return string.length() > 0 ? string.length() : 0;
    }

    @Override
    public String getValue() {
        return string;
    }
}
