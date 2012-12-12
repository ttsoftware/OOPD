package spreadsheet;

import quickcheck.Generator;

import java.util.Random;

public class ExpressionGenerator extends Generator<ExpressionInfo> {

    private final Expression expression;
    private final int intGen = new Random().nextInt();
    private final boolean boolGen = new Random().nextBoolean();
    private final String stringGen = Integer.toString(new Random().nextInt());

    public ExpressionGenerator() {

        expression = new Expression() {

            @Override
            public boolean toBoolean() {
                return boolGen;
            }

            @Override
            public int toInt() {
                return intGen;
            }

            @Override
            public String toString() {
                return stringGen;
            }
        };
    }

    @Override
    public ExpressionInfo next() {
        return new ExpressionInfo(expression, intGen, boolGen, stringGen);
    }
}
