package spreadsheet.arithmetic;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class AConst extends Expression {

    private final int constant;

    public AConst(int constant) {
        this.constant = constant;
    }

    @Override
    public boolean toBoolean() {
        return (constant == 1);
    }

    @Override
    public int toInt() {
        return constant;
    }

    @Override
    public String getValue() {
        return Integer.toString(constant);
    }

    public int getConstant() {
        return constant;
    }
}
