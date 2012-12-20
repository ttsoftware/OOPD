package ui.command;

import spreadsheet.Application;
import spreadsheet.Expression;
import spreadsheet.Position;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetCommand extends Command {

    private Position position;

    public GetCommand(String input) {

        Pattern pattern = Pattern.compile("([0-9]+)\\s([0-9]+)");
        Matcher matcher = pattern.matcher(input);

        matcher.find();

        int row = Integer.parseInt(matcher.group(1));
        int column = Integer.parseInt(matcher.group(2));

        position = new Position(row, column);
    }

    @Override
    public void execute() {

        Expression expression = Application.instance.getWorksheet().get(position);
        System.out.println(expression.toString());
    }
}
