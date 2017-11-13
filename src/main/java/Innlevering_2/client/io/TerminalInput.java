package Innlevering_2.client.io;

import java.util.Scanner;

public class TerminalInput
{
    private Scanner input;

    public TerminalInput()
    {
        input = new Scanner(System.in);
    }

    // Todo: input.nextLine()
    // Todo: help -> Server gives instructions
    public String getTerminalInput() { return (input.hasNext()) ? input.nextLine() : null; }

    public void close()
    {
        input.close();
    }
}
