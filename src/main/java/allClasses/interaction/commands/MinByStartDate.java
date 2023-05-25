package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.interaction.console.CommandCaller;

import java.util.Comparator;

import static allClasses.collection.Collection.collection;

public class MinByStartDate extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести любой объект из коллекции, значение поля startDate которого является минимальным";
    }

    public static void execute() {
        if (collection.stream().min(Comparator.comparing(Worker::getStartDate)).isPresent()) {
            Worker worker = collection.stream().min(Comparator.comparing(Worker::getStartDate)).get();
            System.out.println(worker);
        }
        MinByStartDate minByStartDate = new MinByStartDate();
        CommandCaller.history.add(minByStartDate.getName());
        CommandCaller.executed = true;
    }
}
