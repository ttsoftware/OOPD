package ui.command;

import spreadsheet.*;
import spreadsheet.arithmetic.AConst;
import spreadsheet.arithmetic.Add;
import spreadsheet.arithmetic.Neg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetCommand extends Command {

    private String input;

    public SetCommand(final String input) {
        this.input = input;
    }

    @Override
    public void execute() {

        Pattern pattern = Pattern.compile("([0-9])\\s([0-9])\\s(.*?)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {

            int column = Integer.parseInt(matcher.group(1));
            int row = Integer.parseInt(matcher.group(2));
            String expressionCycle = matcher.group(3);

            ArrayList<String> c = new ArrayList<>();
            Collections.addAll(c, expressionCycle.split("\\s"));

            Iterator i = c.iterator();

            try {
                Expression e = recurEval(i);
                Spreadsheet sp = Application.instance.getWorksheet();
                sp.set(new Position(column, row), e);
            }
            catch (NoSuchSpreadsheetException e1) {
                e1.printStackTrace();
            }
        }
    }

    public Expression recurEval(Iterator i) throws NoSuchSpreadsheetException {

        String token = (String) i.next();

        switch (token) {
            case "AConst": {
                int arg = Integer.parseInt((String) i.next());
                return new AConst(arg);
            }
            case "Add": {
                Expression arg1 = recurEval(i);
                Expression arg2 = recurEval(i);
                return new Add(arg1, arg2);
            }
            case "Neg": {
                Expression arg = recurEval(i);
                return new Neg(arg);
            }
            case "CellReference": {

                String name = (String) i.next();
                int column = Integer.parseInt((String) i.next());
                int row = Integer.parseInt((String) i.next());

                Spreadsheet sp = Application.instance.getSpreadsheet(name);

                return new CellReference(sp, new Position(column, row));
            }
            default: {
                return null;
            }
        }
    }
}
