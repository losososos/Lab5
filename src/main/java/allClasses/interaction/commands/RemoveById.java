package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import exceptions.WrongFormatException;

import java.util.Objects;

import static allClasses.collection.Collection.collection;

public class RemoveById extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " {id}\t-\tудалить элемент из коллекции по его id";
    }

    public static void execute(String inputId, Boolean script) {
        RemoveById removeById = new RemoveById();
        Long id = null;
        if (script) {
            System.out.println(removeById.getName());
        }
        try {
            id = Long.valueOf(inputId);
        } catch (NumberFormatException e) {
            if (!script) {
                new WrongFormatException("число").printMessage();
                id = InputManager.declareId();
            }
        }
        Boolean wasRemoved = false;
        if (id != null) {
            for (Worker worker : collection) {
                if (id == worker.getId()) {
                    collection.remove(worker);
                    System.out.println("\tОбъект удален из коллекции");
                    wasRemoved = true;
                }
            }
            if(!wasRemoved){
                System.out.println("\tВведенный id не найден");
            }
        }else{
            new WrongFormatException("число").printMessage();
        }
        CommandCaller.history.add(removeById.getName());
        CommandCaller.executed = true;
    }
}
