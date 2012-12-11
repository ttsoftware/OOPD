import org.junit.runner.JUnitCore;
import tests.A2;
import tests.A3;
import tests.ExpressionTest;
import tests.PositionTest;

public class Main {

    @org.junit.Test
    public void test() {
        JUnitCore.runClasses(
                A2.class,
                A3.class,
                PositionTest.class,
                ExpressionTest.class);
    }
}
