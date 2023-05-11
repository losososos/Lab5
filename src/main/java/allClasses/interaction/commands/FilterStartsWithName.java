package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.InputManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedHashSet;

public class  FilterStartsWithName extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести элементы, значение поля name которых начинается с заданной подстроки";
    }

    public static void execute() throws IOException, ParserConfigurationException, SAXException {
        LinkedHashSet<Worker> workersXml = XmlManager.readWorker();
        LinkedHashSet<Worker> workers = Collection.getCollection();
        workers.addAll(workersXml);
        String nameBegin = InputManager.declareName();
        if (workers.size() != 0){
            System.out.println("Подходящие элементы коллекции:");
            for (Worker worker : workers)
                if (worker.getName().contains(nameBegin)) {
                    System.out.println("\t" + worker);
                }
        }else{
            System.out.println("Коллекция пуста");
        }
    }

}
