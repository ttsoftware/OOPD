package ui.command;

import spreadsheet.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadCommand extends Command {

    private String filename;

    public LoadCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {

        ArrayList<String> state = new ArrayList<>();

        try {

            FileReader reader = new FileReader(filename);
            BufferedReader in = new BufferedReader(reader);

            while (in.ready()) {
                state.add(in.readLine());
            }

            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        Application.instance.setState(state);
    }
}
