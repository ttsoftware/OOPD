import spreadsheet.Application;
import ui.CommandInterpreter;

import java.util.ArrayList;
import java.util.Scanner;

final class Interpreter {

    private final Scanner scanner;

    private Interpreter() {
        this.scanner = new Scanner(System.in);
    }

    public void prompt() {

        String command = null;

        while (true) {
            System.out.print("> ");
            command = this.scanner.nextLine();
            Application.instance.appendState(command);
            try {
                CommandInterpreter.interpret(new Scanner(command)).execute();
            }
            catch (StackOverflowError e) {
                // Dette er faktisk en løsning på cykliske expressions, om end ikke særlig køn.
                System.out.println("Cyclic Expression");
            }
        }
    }

    public static void main(String[] _) {
        new Interpreter().prompt();
    }

}