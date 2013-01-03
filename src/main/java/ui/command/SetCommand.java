package ui.command;

import spreadsheet.*;
import spreadsheet.arithmetic.AConst;
import spreadsheet.arithmetic.Add;
import spreadsheet.arithmetic.Neg;

import java.util.Scanner;

public class SetCommand extends Command {

    private Scanner scanner;

    public SetCommand(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {

        int column = scanner.nextInt();
        int row = scanner.nextInt();

        try {
            Expression e = recurEval(scanner);
            Spreadsheet sp = Application.instance.getWorksheet();
            sp.set(new Position(column, row), e);
        } catch (NoSuchSpreadsheetException e1) {
            e1.printStackTrace();
        }
    }

    public Expression recurEval(Scanner scanner) throws NoSuchSpreadsheetException {

        String token = scanner.next();

        switch (token) {
            case "AConst": {
                int arg = scanner.nextInt();
                return new AConst(arg);
            }
            case "Add": {
                Expression arg1 = recurEval(scanner);
                Expression arg2 = recurEval(scanner);
                return new Add(arg1, arg2);
            }
            case "Neg": {
                Expression arg = recurEval(scanner);
                return new Neg(arg);
            }
            case "CellReference": {

                String name = scanner.next();
                int column = scanner.nextInt();
                int row = scanner.nextInt();

                Spreadsheet sp = Application.instance.getSpreadsheet(name);

                return new CellReference(sp, new Position(column, row));
            }
            default: {
                throw new IllegalArgumentException("No such expression exist.");
            }
        }
    }
}
