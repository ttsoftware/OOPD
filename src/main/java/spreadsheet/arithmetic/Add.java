package spreadsheet.arithmetic;

import spreadsheet.Expression;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 12/5/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class Add extends AConst {

    public Add(final Expression first, final Expression second) {
        super(first.toInt() + second.toInt());
    }
}
