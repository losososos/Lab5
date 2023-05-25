package allClasses.collection;

import allClasses.classInf.Worker;

import java.time.LocalDate;

import java.util.Date;
import java.util.LinkedHashSet;

public class Collection {
    public static final LinkedHashSet<Worker> collection = new LinkedHashSet<>();
    public static final String type = "LinkedHashSet";
    private static final Date initDate = new Date();
    public static void clear() {
        collection.clear();
    }

    public static void addWorker(Worker worker){
        collection.add(worker);
    }
    public static String getType() {
        return type;
    }
    public static Date getInitDate(){
        return initDate;
    }

    public static LinkedHashSet<Worker> getCollection() {
        return collection;
    }

}
