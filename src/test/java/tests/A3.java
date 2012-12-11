package tests;

import org.junit.Test;
import spreadsheet.CellReference;
import spreadsheet.Expression;
import spreadsheet.Position;
import spreadsheet.Spreadsheet;
import spreadsheet.arithmetic.AConst;
import spreadsheet.arithmetic.Add;
import spreadsheet.logical.Conjunct;
import spreadsheet.logical.Disjunct;
import spreadsheet.logical.LConst;
import spreadsheet.textual.Concat;
import spreadsheet.textual.TConst;

public class A3 {

    @Test
    public void test() {

        final Spreadsheet spreadsheet = new Spreadsheet();

        // Create an expression for the first cell
        Expression e1 = new Conjunct(new LConst(true), new TConst(""));

        Expression e2 = new Disjunct(new LConst(false), new TConst("true"));

        Expression efoo = new Add(e1, e2);
        spreadsheet.set(new Position(1, 1), efoo);

        // Create an expression for the second cell
        Expression e3 = new CellReference(spreadsheet, new Position(1, 1));

        Expression e4 = new AConst(41);
        Expression ebar = new Add(e3, e4);

        spreadsheet.set(new Position(2, 1), ebar);
        Expression e5 = new TConst("The answer to life, the universe and everything: ");

        Expression e6 = new CellReference(spreadsheet, new Position(2, 1));

        Expression ebaz = new Concat(e5, e6);
        spreadsheet.set(new Position(4, 4), ebaz);

        // Extract values from the spreadsheet
        String result = spreadsheet.get(new Position(4, 4)).toString();
        System.out.println(result);
    }
}