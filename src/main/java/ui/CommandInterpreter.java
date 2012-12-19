package ui;

import spreadsheet.Expression;
import spreadsheet.Position;
import ui.command.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CommandInterpreter {

    private CommandInterpreter() {
        // The class should not be instanciated.
    }

    public static Command interpret(final Scanner scanner) {

        final String keyword = scanner.next();

        switch (keyword) {
            case "pws": // print current worksheet
                return new PwsCommand();
            case "ns": // initialize new worksheet
                return null;
            case "ls": // list spreadsheets
                return null;
            case "cws": // change worksheet
                return null;
            case "set": { // sets the given expression at a given position in the worksheet

                // set 0 0 Add AConst 4 AConst 5

                String input = scanner.nextLine();
                Pattern pattern = Pattern.compile("([0-9]+)\\s([0-9]+)\\s(.*?)");
                Matcher matcher = pattern.matcher(input);

                int row = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));
                String expressionCycle = matcher.group(3);

                StringTokenizer tokenizer = new StringTokenizer(expressionCycle, " ");

                TreeSet<Expression> expressions = new TreeSet<Expression>();

                while (tokenizer.hasMoreTokens()) {

                    String className = tokenizer.nextToken();
                    Object parameter = tokenizer.nextElement();

                    try {
                        Class c = Class.forName(className);
                        Constructor co = c.getConstructor();
                        Expression ex = (Expression) co.newInstance(parameter);
                        expressions.add(ex);
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

                return new SetCommand();
            }
            case "get": { // gets the expression at the give position in the worksheet

                String input = scanner.nextLine();
                Pattern pattern = Pattern.compile("([0-9]+)\\s([0-9]+)");
                Matcher matcher = pattern.matcher(input);

                int row = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));

                Position position = new Position(row, column);

                return new GetCommand(position);
            }
            case "exit":
                return new ExitCommand();
            default:
                return new FailedCommand(String.format("Illegal start of command, \"%s\".", keyword));
        }
    }
}