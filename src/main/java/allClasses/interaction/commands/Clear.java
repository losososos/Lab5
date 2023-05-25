package allClasses.interaction.commands;

import allClasses.collection.Collection;
import allClasses.interaction.console.CommandCaller;

public class Clear extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tочистить коллекцию";
    }
    public static void execute() {
        Collection.clear();
        System.out.println("\tКоллекция была очищена");
        Clear clear = new Clear();
        CommandCaller.history.add(clear.getName());
        CommandCaller.executed = true;
    }
}
