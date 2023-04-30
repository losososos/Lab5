package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;

public class  Add extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t\t\t\t\t\t\t\t\t\t\t-\tдобавить новый элемент в коллекцию";
    }

    @Override
    public String execute(Object inputData) {
        if (inputData instanceof Worker worker) {
            Collection.addWorker(worker);
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
