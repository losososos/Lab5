package allClasses.interaction.commands;

import allClasses.interaction.console.CommandCaller;

public class History extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести последние 15 команд (без их аргументов)";
    }

    public static void execute() {
        if (CommandCaller.history.size() == 0) {
            System.out.println("\tИстория введенных команд пуста");
        } else {
            System.out.println("История введенных команд");
            CommandCaller.history.forEach(System.out::println);
        }
        History history = new History();
        CommandCaller.history.add(history.getName());
        CommandCaller.executed = true;
    }
}
