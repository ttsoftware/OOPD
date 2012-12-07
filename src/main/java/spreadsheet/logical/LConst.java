package spreadsheet.logical;

import spreadsheet.Expression;

public class LConst extends Expression {

    private final boolean constant;

    public LConst(boolean constant) {
        this.constant = constant;
    }

    @Override
    public boolean toBoolean() {
        return constant;
    }

    @Override
    public int toInt() {
        return constant ? 1 : 0;
    }

    @Override
    public String toString() {
        if (constant) return "true";
        else return "false";
    }
}
