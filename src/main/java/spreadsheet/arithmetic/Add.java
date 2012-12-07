package spreadsheet.arithmetic;

import spreadsheet.Expression;

public class Add extends AConst {

    public Add(final Expression firstOperand, final Expression secondOperand) {
        super(firstOperand.toInt() + secondOperand.toInt());
    }
}
