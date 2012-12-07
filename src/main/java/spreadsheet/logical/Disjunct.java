package spreadsheet.logical;

import spreadsheet.Expression;

public class Disjunct extends LConst {

    public Disjunct(final Expression firstOperand, final Expression secondOperand) {
        super(firstOperand.toBoolean() || secondOperand.toBoolean());
    }
}
