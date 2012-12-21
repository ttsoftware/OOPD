package ui.command;

import spreadsheet.Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;

public class SaveCommand extends Command {

    private String filename;

    public SaveCommand(String filename) {
        this.filename = filename;
    }

    @Override
    public void execute() {
        ArrayList<String> state = Application.instance.getState();

        // write to file
        try {
            // Create file
            FileWriter fstream = new FileWriter(filename);
            BufferedWriter out = new BufferedWriter(fstream);

            for (String command : state) {
                out.write(command + "\n");
            }

            //Close the output stream
            out.close();
        }
        catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}
