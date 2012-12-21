package ui;

import spreadsheet.Position;
import ui.command.*;

import java.util.Scanner;

public final class CommandInterpreter {

    private CommandInterpreter() {
        // The class should not be instanciated.
    }

    public static Command interpret(final Scanner scanner) {

        final String keyword = scanner.next();

        switch (keyword) {
            case "pws": { // print current worksheet
                return new PwsCommand();
            }
            case "ns": { // initialize new spreadsheet
                return new NsCommand();
            }
            case "ls": { // list spreadsheets
                return new LsCommand();
            }
            case "cws": { // change worksheet
                String name = scanner.next();
                return new ChangeWorksheetCommand(name);
            }
            case "set": { // sets the given expression at a given position in the worksheet
                String input = scanner.nextLine().trim();
                return new SetCommand(input);
            }
            case "get": { // gets the expression at the give position in the worksheet
                int row = scanner.nextInt();
                int column = scanner.nextInt();
                return new GetCommand(new Position(row, column));
            }
            case "save": {
                String filename = scanner.nextLine().trim();
                return new SaveCommand(filename);
            }
            case "load": {
                String filename = scanner.nextLine().trim();
                return new LoadCommand(filename);
            }
            case "exit": {
                return new ExitCommand();
            }
            default: {
                return new FailedCommand(String.format("Illegal start of command, \"%s\".", keyword));
            }
        }
    }
}