package allClasses.interaction.commands;

import allClasses.collection.Collection;
import interfaces.Executable;

public class Info extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tдобавить новый элемент в коллекцию";
    }


    public static void execute() {
;
        System.out.println("Информация о коллекции:\n" + "\tТип коллекции: " + Collection.getType() + "\n" + "\tКоличество элементов: " + Collection.getCollection().size() + "\n" + "\tВремя создания: "+ Collection.declareTime);
    }
}