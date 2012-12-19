package ui.command;

import spreadsheet.Application;

public class PwsCommand extends Command {

    @Override
    public void execute() {

        // Should we print the worksheet as ASCII art?

        String worksheetName = Application.instance.getWorksheet().getName();
        System.out.println(worksheetName);
    }
}
