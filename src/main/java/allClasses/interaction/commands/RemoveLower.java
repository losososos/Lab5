package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import exceptions.EmptyCollectionException;
import exceptions.WarningException;
import exceptions.WrongFormatException;

import java.util.LinkedHashSet;
import java.util.Objects;

import static allClasses.collection.Collection.collection;

public class RemoveLower extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " {weight}\t-\tудалить из коллекции все элементы, имеющие меньший вес, чем заданный";
    }

    public static void execute(String inputWeight, Boolean script) {
        RemoveLower removeLower = new RemoveLower();
        if(!collection.isEmpty()) {
            Long weight = null;
            try {
                weight = Long.valueOf(inputWeight);
            } catch (NumberFormatException e) {
                if (!script) {
                    new WrongFormatException("число").printMessage();
                    weight = InputManager.declareWeight();
                }
            }
            if (weight != null) {
                LinkedHashSet<Worker> removeWorkers = new LinkedHashSet<>();
                for (Worker worker : collection) {
                    if (weight > worker.getPerson().getWeight()) {
                        removeWorkers.add(worker);
                    }
                }
                if(!removeWorkers.isEmpty()) {
                    collection.removeAll(removeWorkers);
                    System.out.println("Элементы удалены");
                }else {
                    System.out.println("Подходящие элементы не найдены");
                }
            } else {
                new WrongFormatException("число").printMessage();
            }
        }else{
            new EmptyCollectionException().printMessage();
        }
        CommandCaller.history.add(removeLower.getName());
        CommandCaller.executed = true;
    }
}
