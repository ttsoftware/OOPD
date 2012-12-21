package ui;

import spreadsheet.Application;
import spreadsheet.Position;
import ui.command.*;

import java.util.ArrayList;
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
                return null;
            }
            case "set": { // sets the given expression at a given position in the worksheet
                String input = scanner.nextLine().trim();
                return new SetCommand(input);
            }
            case "get": { // gets the expression at the give position in the worksheet
                String input = scanner.nextLine().trim();
                return new GetCommand(input);
            }
            case "save": {
                String filename = scanner.nextLine().trim();
                return new SaveCommand(filename);
            }
            case "load": {
                String filename = scanner.nextLine().trim();

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