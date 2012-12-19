package ui;

import spreadsheet.Position;
import ui.command.*;

import java.util.Scanner;
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
            case "ns": // initialize new spreadsheet
                return new NsCommand();
            case "ls": // list spreadsheets
                return new LsCommand();
            case "cws": // change worksheet
                return null;
            case "set": { // sets the given expression at a given position in the worksheet

                // set 0 0 Add AConst 4 AConst 5

                String input = scanner.nextLine();
                Pattern pattern = Pattern.compile("([0-9]+)\\s([0-9]+)\\s(.*?)");
                Matcher matcher = pattern.matcher(input);

                matcher.find();

                int row = Integer.parseInt(matcher.group(1));
                int column = Integer.parseInt(matcher.group(2));
                String expressionCycle = matcher.group(3);

                return new SetCommand();
            }
            case "get": { // gets the expression at the give position in the worksheet

                String input = scanner.nextLine();
                Pattern pattern = Pattern.compile("([0-9]+)\\s([0-9]+)");
                Matcher matcher = pattern.matcher(input);

                matcher.find();

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