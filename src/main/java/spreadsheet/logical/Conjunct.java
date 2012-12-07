package spreadsheet.logical;

import spreadsheet.Expression;

public class Conjunct extends LConst {

    public Conjunct(final Expression firstOperand, final Expression secondOperand) {
        super(firstOperand.toBoolean() && secondOperand.toBoolean());
    }
}
