package ui.commands;

import ui.Console;

public class AddMember implements Command {
    Console console;
    
    public AddMember(Console console) {
        this.console = console;
    }

    @Override
    public String getDescription() {
        return "Добавить члена семьи";
    }

    @Override
    public void execute() {
        console.addHuman();
    }
    
}
