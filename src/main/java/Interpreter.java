import java.io.PrintStream;
import java.io.InputStream;
import java.util.Scanner;

import ui.CommandInterpreter;

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
            CommandInterpreter.interpret(new Scanner(command)).execute();
        }
    }

    public static void main(String[] _) {
        new Interpreter().prompt();
    }

}