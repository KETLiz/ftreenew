package ui.commands;

import ui.Console;

public class ReadFromFile implements Command {
    Console console;
    
    public ReadFromFile(Console console) {
        this.console = console;
    }
    @Override
    public String getDescription() {
        return "Считать из файла";
    }

    @Override
    public void execute() throws ClassNotFoundException {
        console.readMember();
    }
    
}
