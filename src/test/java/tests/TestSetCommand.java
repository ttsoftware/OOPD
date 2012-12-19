package tests;

import org.junit.Test;
import spreadsheet.Expression;
import spreadsheet.arithmetic.Add;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSetCommand {

    @Test
    public void Test() {

        String input = "1 0 Add AConst 4 AConst 5";
        Pattern pattern = Pattern.compile("([0-9])\\s([0-9])\\s(.*?)");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {

            int row = Integer.parseInt(matcher.group(1));
            int column = Integer.parseInt(matcher.group(2));
            String expressionCycle = matcher.group(3);

            System.out.println(row);
            System.out.println(column);
            System.out.println(expressionCycle);

            String[] cycle = expressionCycle.split("\\s");

            System.out.println(Arrays.toString(cycle));

            StringTokenizer c = new StringTokenizer(expressionCycle, " ");


            System.out.println(recurMatch(c.nextToken(), c));
        }
    }

    public Expression recurMatch(String ex, StringTokenizer cycle) {

        if (ex.matches("\\d")) {

            return recurMatch(cycle.nextToken(), cycle);
        }
        else {

            try {
                Class c = Class.forName("spreadsheet.arithmetic." + ex);

                Constructor<Expression> con = c.getConstructor(Integer.class);

                Expression expression = (Expression) con.newInstance(
                        recurMatch(cycle.nextToken(), cycle)
                );

                return expression;
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
