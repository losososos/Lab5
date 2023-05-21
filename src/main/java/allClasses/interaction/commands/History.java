package allClasses.interaction.commands;

import allClasses.interaction.console.CommandCaller;

public class History extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести последние 15 команд (без их аргументов)";
    }

    public static void execute() {
        for(String command: CommandCaller.history){
            System.out.println(command);
        }
        History history = new History();
        CommandCaller.history.add(history.getName());
    }
}
