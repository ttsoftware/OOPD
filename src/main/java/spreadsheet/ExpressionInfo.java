package spreadsheet;

import quickcheck.Info;

public class ExpressionInfo extends Info<Expression> {

    private final int exInt;
    private final boolean exBool;
    private final String exString;

    public ExpressionInfo(Expression value, int exInt, boolean exBool, String exString) {
        super(value);
        this.exInt = exInt;
        this.exBool = exBool;
        this.exString = exString;
    }

    public int getInt() {
        return exInt;
    }

    public boolean getBool() {
        return exBool;
    }

    public String getString() {
        return exString;
    }

    @Override
    public String toString() {
        return exString;
    }
}
