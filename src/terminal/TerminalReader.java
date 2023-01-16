package terminal;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;
    private CommandParser commandParser;

    public static TerminalReader getInstance(CommandParser commandParser){
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }
    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void view() {
        Scanner sc= new Scanner(System.in);
        while (true){
            int variant = sc.nextInt();
        }
    }
}
