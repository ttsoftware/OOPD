package spreadsheet.logical;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class Conjunct extends LConst {

    public Conjunct(Expression first, Expression second) {
        super(first.toBoolean() && second.toBoolean());
    }
}
