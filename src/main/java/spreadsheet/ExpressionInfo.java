package spreadsheet;

import quickcheck.Info;

public class ExpressionInfo extends Info<Expression> {

    protected ExpressionInfo(Expression value) {
        super(value);
    }

    @Override
    public String toString() {
        return getValue().toString();
    }
}
