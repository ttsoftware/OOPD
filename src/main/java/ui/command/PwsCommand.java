package ui.command;

import spreadsheet.Application;

public class PwsCommand extends Command {

    @Override
    public void execute() {
        System.out.println(Application.instance.getWorksheet().getName());
    }
}
