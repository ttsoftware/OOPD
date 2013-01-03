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

            // Integer
            final int expectedInt = info.getInt();
            final int actualInt = info.getValue().toInt();

            // Boolean
            final boolean expectedBool = info.getBool();
            final boolean actualBool = info.getValue().toBoolean();

            // String
            final String expectedString = info.getString();
            final String actualString = info.getString();

            if (!(expectedInt == actualInt)) {
                System.err.println("getInt() failed. " + info.getInt());
            }
            if (!(expectedBool == actualBool)) {
                System.err.println("getBool() failed. " + info.getBool());
            }
            if (!(expectedString.equals(actualString))) {
                System.err.println("getString() failed. " + info.getString());
            }
        }
    }
}
