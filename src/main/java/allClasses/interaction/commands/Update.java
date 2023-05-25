package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import allClasses.interaction.console.ScannerInput;
import exceptions.WrongFormatException;

import java.util.LinkedHashSet;

import static allClasses.collection.Collection.collection;

public class Update extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " {id}\t-\tобновить значение элемента коллекции, id которого равен заданному";
    }

    public static void execute(String inputId, Boolean script) {
        Long id = null;
        if(!script) {
            try {
                id = Long.valueOf(inputId);
            } catch (NumberFormatException e) {
                new WrongFormatException("число").printMessage();
                id = InputManager.declareId();
            }
        }
        if (collection.size() != 0){
            for (Worker worker : collection)
                if(id == worker.getId()){
                    collection.remove(worker);
                    Worker newWorker = ScannerInput.readWorker();
                    collection.add(newWorker);
                }
        }else{
            System.out.println("Коллекция пуста");
        }
        Update updateID = new Update();
        CommandCaller.history.add(updateID.getName());
        CommandCaller.executed = true;
    }
}
