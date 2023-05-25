package allClasses.interaction.commands;

import allClasses.classInf.*;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import allClasses.interaction.console.ScannerInput;
import exceptions.EmptyCollectionException;
import exceptions.WrongDataException;
import exceptions.WrongFormatException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

import static allClasses.collection.Collection.collection;

public class AddIfMin extends AbstractCommand{
    @Override
    public String getInfo() {
        return " \t" + getName() + " {salary}\t-\tдобавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }

    public static void execute(Worker worker) {
        AddIfMin addIfMin = new AddIfMin();
        if (collection.size()>0) {
            Worker minWorker = collection.stream().min(Comparator.comparing(Worker::getPosition)).get();
            if(worker.getSalary() < minWorker.getSalary()){
                collection.add(worker);
                System.out.println("Элемент добавлен в коллекцию");
            }else {
                System.out.println("Элемент не добавлен в коллекцию");
            }
        }else{
            new EmptyCollectionException().printMessage();
        }
        CommandCaller.history.add(addIfMin.getName());
        CommandCaller.executed = true;
    }

    public static void executeScript(ArrayList<String> characteristics, Boolean script){

        try {
            long id = Long.parseLong(characteristics.get(0));
            String name = characteristics.get(1);
            Double salary = Double.parseDouble(characteristics.get(2));
            LocalDateTime startDate = LocalDateTime.parse(characteristics.get(3), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            Position position = Position.valueOf(characteristics.get(4));
            Status status = Status.valueOf(characteristics.get(5));
            Double x = Double.parseDouble(characteristics.get(6));
            Float y = Float.parseFloat(characteristics.get(7));
            ZonedDateTime creationDate = ZonedDateTime.parse(characteristics.get(8), DateTimeFormatter.ISO_ZONED_DATE_TIME);
            LocalDate birthday = LocalDate.parse(characteristics.get(9), DateTimeFormatter.ISO_LOCAL_DATE);
            long weight = Long.parseLong(characteristics.get(10));
            Color eyeColor = Color.valueOf(characteristics.get(11));
            Country nationality = Country.valueOf(characteristics.get(12));
            Worker worker = new Worker(name, salary, position, status, startDate, birthday, eyeColor, weight, nationality, x, y);
            worker.setId(id);
            worker.setCreationDate(creationDate);
            AddIfMin.execute(worker);
        }catch (DateTimeParseException |IllegalArgumentException e){
            new WrongDataException().printMessage();
        }
    }
}
