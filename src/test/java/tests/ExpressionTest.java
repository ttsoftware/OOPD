package tests;

import quickcheck.Values;
import spreadsheet.ExpressionGenerator;
import spreadsheet.ExpressionInfo;

public class ExpressionTest {

    private ExpressionGenerator expressionGen;

    @org.junit.Before
    public void initializeExpressionGenerator() {
        this.expressionGen = new ExpressionGenerator();
    }

    @org.junit.Test
    public void test() {

        final Values<ExpressionInfo> infos = new Values<ExpressionInfo>(this.expressionGen);

        for (final ExpressionInfo info : infos) {

            // ???
        }
    }
}
