package spreadsheet.arithmetic;

import spreadsheet.Expression;

public class Neg extends AConst {

    public Neg(final Expression operand) {
        super(-operand.toInt());
    }
}
