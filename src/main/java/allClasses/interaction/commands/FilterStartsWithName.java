package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;
import allClasses.interaction.console.InputManager;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.LinkedHashSet;

import static allClasses.collection.Collection.collection;

//import static allClasses.data.XmlManager.workersXml;

public class  FilterStartsWithName extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + " name\t-\tвывести элементы, значение поля name которых начинается с заданной подстроки";
    }

    public static boolean execute(String nameBegin, Boolean script) throws IOException, ParserConfigurationException, SAXException {
        if(nameBegin == null & !script) {
            nameBegin = InputManager.declareString();
        }
        if (collection.size() != 0){
            System.out.println("Подходящие элементы коллекции:");
            for (Worker worker : collection)
                if (worker.getName().startsWith(nameBegin)) {
                    System.out.println("\t" + worker);
                }
        }else{
            System.out.println("Коллекция пуста");
        }
        FilterStartsWithName filterStartsWithName = new FilterStartsWithName();
        CommandCaller.history.add(filterStartsWithName.getName());
        CommandCaller.executed = true;
        return true;
    }

}
