package allClasses.interaction.commands;


import allClasses.classInf.Worker;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;


public class  Show extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tвывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }

    public static void execute() throws IOException, ParserConfigurationException, SAXException {
        LinkedHashSet<Worker> workersXml = XmlManager.readWorker();
        LinkedHashSet<Worker> workers = Collection.getCollection();
        workers.addAll(workersXml);
        if (workers.size() != 0){
            System.out.println("Содержимое коллекции:");
            for (Worker worker : workers)
                System.out.println("\t" + worker.toString());
        }else{
            System.out.println("Коллекция пуста");
        }
        Show show = new Show();
        CommandCaller.history.add(show.getName());
    }
}
