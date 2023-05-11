package allClasses.interaction.commands;

import allClasses.classInf.*;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;
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
//        File xmlFile = new File("workers.xml");
//        if (!xmlFile.exists()) {
//            try {
//                xmlFile.createNewFile();
//                // Вызываем метод добавления элементов в XML-файл
//                for (Worker worker : workers) {
//                    addWorkerToXmlFile(worker);
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
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
//            for(Worker worker: collection)
                XmlManager.saveWorker(worker);
            }
            }else{
                System.out.println("\tКоллекция пуста");
            }

//        Collection collection = new Collection();
//        LinkedHashSet<Worker> workersList = collection.getCollection();
//        Object[] Array = workersList.toArray(workersList.toArray(new Worker[0]));
//        if (workersList.size() != 0) {
//            Workers workers = new Workers();
//            workers.setWorkers(workersList);
//            System.out.println("\tТекущая коллекция сохранена в файл");
//        } else System.out.println("\tКоллекция пуста. Сохранять нечего");
        }
    }