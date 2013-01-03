package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;
import spreadsheet.arithmetic.AConst;
import spreadsheet.arithmetic.Add;
import spreadsheet.arithmetic.Neg;

public class ExpressionGenerator extends Generator<ExpressionInfo> {

    private final IntegerGenerator switchGen;
    private final IntegerGenerator intGen;

    public ExpressionGenerator() {
        switchGen = new IntegerGenerator(0, 2);
        intGen = new IntegerGenerator();
    }

    @Override
    public ExpressionInfo next() {

        final int integer = intGen.next();

        switch (switchGen.next()) {
            case 0:
                Expression negExpression = new Neg(next().getValue());
                return new ExpressionInfo(negExpression, negExpression.toInt());
            case 1:
                Expression addExpression = new Add(next().getValue(), next().getValue());
                return new ExpressionInfo(addExpression, addExpression.toInt());
            case 2:
                return new ExpressionInfo(new AConst(integer), integer);
        }

        return null;
    }
}
