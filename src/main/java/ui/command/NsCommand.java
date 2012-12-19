package ui.command;

import spreadsheet.Application;

public class NsCommand extends Command {

    @Override
    public void execute() {
        Application.instance.newSpreadsheet();
    }
}
