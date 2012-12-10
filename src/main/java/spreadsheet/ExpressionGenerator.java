package spreadsheet;

import quickcheck.Generator;

import java.util.Random;

public class ExpressionGenerator extends Generator<ExpressionInfo> {

    private final Expression expression;

    public ExpressionGenerator() {

        expression = new Expression() {

            @Override
            public boolean toBoolean() {
                return new Random().nextBoolean();
            }

            @Override
            public int toInt() {
                return new Random().nextInt();
            }

            @Override
            public String toString() {
                return Integer.toString(new Random().nextInt());
            }
        };
    }

    @Override
    public ExpressionInfo next() {
        return new ExpressionInfo(expression, new Random().nextInt(), new Random().nextBoolean(), Integer.toString(new Random().nextInt()));
    }
}
