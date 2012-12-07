package spreadsheet.logical;

import spreadsheet.Expression;

public class Not extends LConst {

    public Not(final Expression operand) {
        super(!operand.toBoolean());
    }
}
