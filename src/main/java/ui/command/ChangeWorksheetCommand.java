package ui.command;

import spreadsheet.Application;

public class ChangeWorksheetCommand extends Command {

    private String name;

    public ChangeWorksheetCommand(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        Application.instance.changeWorkSheet(name);
    }
}
