package allClasses.interaction.commands;

import allClasses.collection.Collection;

public class Clear extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tочистить коллекцию";
    }

    public static void execute() {
        Collection.clear();
        System.out.println("\tКоллекция был очищена");
    }
}
