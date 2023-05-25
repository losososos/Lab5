package allClasses.interaction.commands;


import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;

import static allClasses.collection.Collection.collection;
//import static allClasses.data.XmlManager.workersXml;


public class  Show extends AbstractCommand {

    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    public static void execute() throws IOException, ParserConfigurationException, SAXException {

        if (collection.size() != 0){
            System.out.println("Содержимое коллекции:");
            for (Worker worker : collection)
                System.out.println("\t" + worker.toString());
        }else{
            System.out.println("\tКоллекция пуста");
        }
        Show show = new Show();
        CommandCaller.history.add(show.getName());
        CommandCaller.executed = true;
    }
}
