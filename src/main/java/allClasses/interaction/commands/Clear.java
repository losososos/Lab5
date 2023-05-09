package allClasses.interaction.commands;

import allClasses.collection.Collection;

public class Clear extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t-\tочистить коллекцию";
    }

    public static String execute() {
        Collection.clear();
        System.out.println("Коллекция был очищена");
        return "Выполнено";
    }
}
