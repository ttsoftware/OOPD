package spreadsheet.textual;

import spreadsheet.Expression;

public class Concat extends TConst {

    public Concat(final Expression firstOperand, final Expression secondOperand) {
        super(firstOperand.toString() + secondOperand.toString());
    }
}
