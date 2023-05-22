package ui.commands;

import ui.Console;

public class Finish implements Command {
    Console console;

    public Finish(Console console) {
        this.console = console;
    }
    
    @Override
    public String getDescription() {
        return "Выход";
    }

    @Override
    public void execute() {
        console.exit();
    }
    
}
