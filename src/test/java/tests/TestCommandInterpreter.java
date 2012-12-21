package tests;

import org.junit.Test;
import ui.CommandInterpreter;

import java.util.Scanner;

public class TestCommandInterpreter {

    @Test
    public void TestInput() {

        String input1 = "set 0 0 Neg Add AConst 4 AConst 5\n" +
                       "set 1 1 Add AConst 3 CellReference Sheet0 0 0\n" +
                       "get 1 1\n" +
                       "exit";

        String input2 = "set 0 0 CellReference Sheet0 1 1\n" +
                        "set 2 2 CellReference Sheet0 0 0\n" +
                        "set 1 1 CellReference Sheet0 2 2\n" +
                        "get 0 0\n" +
                        "get 2 2\n" +
                        "exit";

        Scanner scanner = new Scanner(input1);

        while (true) {
            String command = scanner.nextLine();
            try {
                CommandInterpreter.interpret(new Scanner(command)).execute();
            }
            catch (StackOverflowError e) {
                // Dette er faktisk en løsning på cykliske expressions, om end ikke særlig køn.
                System.out.println("Cyclic Expression");
            }
        }
    }
}
