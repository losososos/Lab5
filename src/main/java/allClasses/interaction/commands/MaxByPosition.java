package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.interaction.console.CommandCaller;

import java.util.Comparator;

import static allClasses.collection.Collection.collection;

public class MaxByPosition extends AbstractCommand{
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести любой объект из коллекции, значение поля position которого является максимальным";
    }
    public static void execute() {
        if (collection.stream().min(Comparator.comparing(Worker::getPosition)).isPresent()) {
            Worker worker = collection.stream().min(Comparator.comparing(Worker::getPosition)).get();
            System.out.println(worker);
        }
        MaxByPosition maxByPosition = new MaxByPosition();
        CommandCaller.history.add(maxByPosition.getName());
        CommandCaller.executed = true;
    }
}
