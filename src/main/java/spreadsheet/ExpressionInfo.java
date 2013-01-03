package spreadsheet;

import quickcheck.Info;

public class ExpressionInfo extends Info<Expression> {

    private final int integer;

    public ExpressionInfo(Expression expression, int integer) {
        super(expression);
        this.integer = integer;
    }

    public int getInt() {
        return integer;
    }

    public boolean getBool() {
        return integer != 0;
    }

    public String getString() {
        return Integer.toString(integer);
    }

    @Override
    public String toString() {
        return Integer.toString(integer);
    }
}
