package tests;

import org.junit.Test;
import ui.CommandInterpreter;

import java.util.Scanner;

public class TestCommandInterpreter {

    @Test
    public void TestInput() {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        CommandInterpreter.interpret(new Scanner(command)).execute();
    }
}
