package ui.command;

import spreadsheet.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveCommand extends Command {

    private String filename;

    public SaveCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {

        ArrayList<String> state = Application.instance.getState();

        try {

            FileWriter stream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(stream);

            for (String command : state) {
                out.write(command + "\n");
            }

            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
