package ui.commands;

import ui.Console;

public class WriteToFile implements Command {
    Console console;
    
    public WriteToFile(Console console) {
        this.console = console;
    }

    @Override
    public String getDescription() {
        return "Запись в файл";
    }

    @Override
    public void execute() {
        console.writeMember();
    }
    
}
