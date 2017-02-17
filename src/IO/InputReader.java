package IO;

import StaticData.SessionData;


import java.io.IOException;
import java.util.Scanner;

public class InputReader {
    public static void readCommands() throws IOException {
        OutputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        while (!input.equals("quit")) {
            CommandInterpreter.interpretCommand(input);
            OutputWriter.writeMessage(String.format("%s > ", SessionData.currentPath));

            input = sc.nextLine().trim();
        }
    }
}