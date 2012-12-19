package ui.command;

import spreadsheet.Application;
import spreadsheet.Expression;
import spreadsheet.Position;

public class GetCommand extends Command {

    private Position position;

    public GetCommand(Position position) {
        this.position = position;
    }

    @Override
    public void execute() {

        Expression expression = Application.instance.getWorksheet().get(position);
        System.out.println(expression.toString());
    }
}
