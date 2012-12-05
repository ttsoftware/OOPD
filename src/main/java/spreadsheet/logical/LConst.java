package spreadsheet.logical;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class LConst extends Expression {

    private final boolean state;

    public LConst(final boolean state) {
        this.state = state;
    }

    @Override
    public boolean toBoolean() {
        return state;
    }

    @Override
    public int toInt() {
        return state ? 1 : 0;
    }

    @Override
    public String getValue() {
        return Boolean.toString(state);
    }

    public boolean isState() {
        return state;
    }
}

