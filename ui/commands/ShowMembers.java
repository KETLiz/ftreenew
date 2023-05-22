package ui.commands;

import ui.Console;

public class ShowMembers implements Command {
    Console console;
    
    public ShowMembers(Console console) {
        this.console = console;
    }
    
    @Override
    public String getDescription() {
        return "Показать всех членов семьи";
    }

    @Override
    public void execute() {
        console.showMembers();
    }
    
}
