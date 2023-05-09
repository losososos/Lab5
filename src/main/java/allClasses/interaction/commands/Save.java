package allClasses.interaction.commands;

import allClasses.classInf.Worker;
import allClasses.classInf.Workers;
import allClasses.collection.Collection;
import allClasses.data.XmlManager;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.Arrays;

import static allClasses.collection.Collection.collection;

public class Save extends AbstractCommand {
    @Override
    public String getInfo() {
        return getName() + "\t-\tсохранить коллекцию в файл";
    }


    public void execute() throws FileNotFoundException, TransformerException {
        String path = "data.xml";
        File file = new File(path);
        if (!file.exists() && file.isDirectory()){
            XmlManager.DeclareXml();
        }
        Worker[] saveArray = collection.toArray(new Worker[collection.size()]);
        for(Worker worker: saveArray){
            XmlManager.SaveWorker(worker);
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
