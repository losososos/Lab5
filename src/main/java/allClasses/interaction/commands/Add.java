package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.console.CommandCaller;

public class  Add extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " \t-\tдобавить новый элемент в коллекцию";
    }

    public static void execute(Worker inputData) {
        if (inputData != null) {
            Collection.addWorker(inputData);
        }
        Add add = new Add();
        CommandCaller.history.add(add.getName());
    }

}
