package ui.command;

import spreadsheet.Application;

public class LsCommand extends Command {

    @Override
    public void execute() {
        for (String spreadsheet : Application.instance.listSpreadsheets()) {
            System.out.println(spreadsheet);
        }
    }
}
