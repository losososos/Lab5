package allClasses.interaction.commands;

import allClasses.classInf.*;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
import allClasses.interaction.console.CommandCaller;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.LinkedHashSet;
import java.util.Arrays;

import static allClasses.collection.Collection.collection;

public class Save extends AbstractCommand {
    @Override
    public String getInfo() {
        return "\t" + getName() + "\t-\tсохранить коллекцию в файл";
    }

    public static void execute() throws IOException, TransformerException, XMLStreamException, ParserConfigurationException, SAXException {
        String path = "data.xml";
        File file = new File(path);
        if (collection.size() != 0) {
            if (file.exists() && !file.isDirectory()) {
                System.out.println("\tСохранение коллекции");
            } else {
                System.out.println("\tФайла не существует, создаю файл");
                XmlManager.DeclareXml();
                System.out.println("\tФайл создан");
                System.out.println("\tСохранение коллекции");
            }
            Worker[] workerArray = collection.toArray(new Worker[collection.size()]);
            for (Worker worker : workerArray) {
                XmlManager.saveWorker(worker);
            }
            }else{
                System.out.println("\tКоллекция пуста");
            }
        Save save = new Save();
        CommandCaller.history.add(save.getName());
        }
    }