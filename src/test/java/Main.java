import org.junit.runner.JUnitCore;
import tests.ExpressionTest;
import tests.PositionTest;

public class Main {

    @org.junit.Test
    public void test() {
        JUnitCore.runClasses(PositionTest.class, ExpressionTest.class);
    }
}
