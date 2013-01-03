package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;
import spreadsheet.arithmetic.AConst;

public class ExpressionGenerator extends Generator<ExpressionInfo> {

    private final IntegerGenerator intGen;

    public ExpressionGenerator() {
        this.intGen = new IntegerGenerator();
    }

    @Override
    public ExpressionInfo next() {
        final int integer = this.intGen.next();
        final Expression expression = new AConst(integer);

        return new ExpressionInfo(expression, integer, (integer != 0), String.valueOf(integer));
    }
}
