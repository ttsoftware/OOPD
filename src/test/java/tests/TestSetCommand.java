package tests;

import org.junit.Test;
import spreadsheet.Application;
import spreadsheet.NoSuchSpreadsheetException;
import spreadsheet.Position;
import spreadsheet.Spreadsheet;
import spreadsheet.arithmetic.AConst;
import ui.command.SetCommand;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSetCommand {

    @Test
    public void test1() throws NoSuchSpreadsheetException {

        Application.instance.newSpreadsheet();

        String input = "0 0 Neg Add AConst 4 AConst 5";

        SetCommand setCommand = new SetCommand(input);
        setCommand.execute();

        input = "1 1 Add AConst 3 CellReference Sheet0 0 0";

        setCommand = new SetCommand(input);
        setCommand.execute();

        Spreadsheet sp = Application.instance.getSpreadsheet("Sheet0");

        AConst p1 = (AConst) sp.get(new Position(0, 0));
        AConst p2 = (AConst) sp.get(new Position(1, 1));

        assertEquals(p1.toInt(), -9);
        assertEquals(p2.toInt(), -6);
    }

    @Test
    public void test2() throws NoSuchSpreadsheetException {

        Application.instance.newSpreadsheet();

        String input = "0 0 Neg Add AConst 4 AConst 5";

        SetCommand setCommand = new SetCommand(input);
        setCommand.execute();

        input = "1 1 Add CellReference Sheet0 0 0 Add Neg AConst -6 Neg AConst 3";

        setCommand = new SetCommand(input);
        setCommand.execute();

        Spreadsheet sp = Application.instance.getSpreadsheet("Sheet0");

        AConst p1 = (AConst) sp.get(new Position(0, 0));
        AConst p2 = (AConst) sp.get(new Position(1, 1));

        assertEquals(p1.toInt(), -9);
        assertEquals(p2.toInt(), -6);
    }

    @Test
    public void testCreateSheet() {

        Application.instance.newSpreadsheet();
        Application.instance.newSpreadsheet();

        try {
            Spreadsheet sp1 = Application.instance.getSpreadsheet("Sheet0");
            Spreadsheet sp2 = Application.instance.getSpreadsheet("Sheet1");
        }
        catch (NoSuchSpreadsheetException e) {
            e.printStackTrace();
        }
    }
}
