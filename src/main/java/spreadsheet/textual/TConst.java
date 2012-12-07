package spreadsheet.textual;

import spreadsheet.Expression;

public class TConst extends Expression {

    private final String constant;

    public TConst(String constant) {
        this.constant = constant;
    }

    @Override
    public boolean toBoolean() {
        return (constant.length() > 0);
    }

    @Override
    public int toInt() {
        return constant.length();
    }

    @Override
    public String toString() {
        return constant;
    }
}
