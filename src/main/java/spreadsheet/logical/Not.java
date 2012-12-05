package spreadsheet.logical;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Not extends LConst {

    public Not(Expression operand) {
        super(!operand.toBoolean());
    }
}
