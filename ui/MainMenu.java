package ui;

import java.util.ArrayList;
import java.util.List;

import ui.commands.AddMember;
import ui.commands.Command;
import ui.commands.Finish;
import ui.commands.ShowMembers;

public class MainMenu {
    List<Command> commandList;

    public MainMenu(Console console) {
        commandList = new ArrayList<>();
        commandList.add(new AddMember(console));
        commandList.add(new ShowMembers(console));
        commandList.add(new Finish(console));
    }

    public String showCommands() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < commandList.size(); i++) {
            sb.append(i+1);
            sb.append(". ");
            sb.append(commandList.get(i).getDescription());
            sb.append("\n");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public void execute(int numCommand) {
        commandList.get(numCommand - 1).execute();
    }

    public int size() {
        return commandList.size();
    }
}
