package tests;

import com.sun.deploy.util.StringUtils;
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

            String[] words = expressionCycle.split(" ");
            expressionCycle = "";

            for (String word : words) {
                expressionCycle = word + " " + expressionCycle;
            }

            System.out.println(row);
            System.out.println(column);
            System.out.println(expressionCycle);

            StringTokenizer c = new StringTokenizer(expressionCycle, " ");

            System.out.println(recurMatch(c.nextToken(), c));
        }
    }

    public Expression recurMatch(String ex, StringTokenizer cycle) {

        if (ex.matches("\\d")) {

            return recurMatch(cycle.nextToken(), cycle);
        }
        else {


        }

        return null;
    }
}
