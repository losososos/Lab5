package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;

public class  Add extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " \t-\tдобавить новый элемент в коллекцию";
    }


    public static String execute(Worker inputData) {
        if (inputData != null) {
            Collection.addWorker(inputData);
        }
        return "Выполнено";
    }

    public boolean isNeedInput() {
        return true;
    }

    public boolean hasTransferData() {
        return true;
    }
}
