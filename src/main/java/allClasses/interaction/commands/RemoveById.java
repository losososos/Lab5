package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;

import java.util.Objects;

import static allClasses.collection.Collection.collection;

public class RemoveById extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tудалить элемент из коллекции по его id";
    }

    public static void execute() {
        String id = InputManager.declareName();
        for (Worker worker : collection) {
            if (Objects.equals(id, worker.getId().toString())) {
                collection.remove(worker);
            }
        }
        RemoveById removeById = new RemoveById();
        CommandCaller.history.add(removeById.getName());
    }
}
