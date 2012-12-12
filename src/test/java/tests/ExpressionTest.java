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

            final int expectedInt = info.getInt();
            final boolean expectedBool = info.getBool();
            final String expectedString = info.getString();

            final int actualInt = info.getValue().toInt();
            final boolean actualBool = info.getValue().toBoolean();
            final String actualString = info.getValue().toString();

            if (actualInt != expectedInt) {
                System.err.println("getInt() failed. " + info);
            }
            if (actualBool != expectedBool) {
                System.err.println("getBool() failed. " + info);
            }
            if (!actualString.equals(expectedString)) {
                System.err.println("getString() failed. " + info);
            }
        }
    }
}
