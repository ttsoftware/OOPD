package spreadsheet.arithmetic;

import spreadsheet.Expression;

public class AConst extends Expression {

    private final int constant;

    public AConst(int constant) {
        this.constant = constant;
    }

    @Override
    public boolean toBoolean() {
        return (constant != 0);
    }

    @Override
    public int toInt() {
        return constant;
    }

    @Override
    public String toString() {
        return Integer.toString(constant);
    }
}
